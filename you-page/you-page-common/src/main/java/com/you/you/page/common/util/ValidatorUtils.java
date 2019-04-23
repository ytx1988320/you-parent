package com.you.you.page.common.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

/**
 * Validator 工具
 * <功能详细描述>
 *
 * @author follow
 * @title Validator 工具
 * @date 2018/4/14
 * @since 1.0.0
 */
public class ValidatorUtils {

    private ValidatorUtils() {
    }

    /**
     * 获取默认的Validator
     *
     * @param
     * @return
     * @title 获取默认的Validator
     * @tables <涉及表说明，便于调用方调试>
     * @special <特殊说明>
     * @author follow
     * @date 2018/4/14
     * @since 1.0.0
     */
    public static Validator validator() {
        return Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     * 验证某个对象
     *
     * @param object
     * @return
     * @title 验证某个对象
     * @tables <涉及表说明，便于调用方调试>
     * @special <特殊说明>
     * @author follow
     * @date 2018/4/14
     * @since 1.0.0
     */
    public static ValidatorResult validate(Object object) {
        Set<ConstraintViolation<Object>> constraintViolations = validator().validate(object);
        if (constraintViolations.isEmpty()) {
            return ValidatorResult.success();
        }

        Iterator<ConstraintViolation<Object>> iterator = constraintViolations.iterator();
        // 用于存储验证后的错误信息
        StringBuffer buffer = new StringBuffer(64);
        while (iterator.hasNext()) {
            String message = iterator.next().getMessage();
            buffer.append(message + "  |  ");
        }

        return ValidatorResult.fail(buffer.toString());
    }

    /**
     * 验证结果
     * <功能详细描述>
     *
     * @author follow
     * @title 验证结果
     * @date 2018/4/14
     * @since 1.0.0
     */
    public static class ValidatorResult {
        /**
         * 是否成功
         */
        private Boolean success;

        /**
         * 描述
         */
        private String description;

        public ValidatorResult(Boolean success, String description) {
            this.success = success;
            this.description = description;
        }

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public static ValidatorResult success() {
            return new ValidatorResult(true, "验证通过");
        }

        public static ValidatorResult fail(String description) {
            return new ValidatorResult(false, description);
        }

        public Boolean failed() {
            return getSuccess() == false;
        }
    }
}
