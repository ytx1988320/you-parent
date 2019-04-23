package com.you.you.page.common.util;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Aspect工具类
 * <功能详细描述>
 *
 * @author follow
 * @title Aspect工具类
 * @date 2018/4/14
 * @since 1.0.0
 */
public final class AspectUtils {

    private static Logger logger = LoggerFactory.getLogger(AspectUtils.class);
    private static final String LOGGER_FIELD_NAME = "logger";

    private AspectUtils() {
    }

    /**
     * 获取logger对象
     *
     * @param joinPoint
     * @return
     */
    public static Logger getLogger(JoinPoint joinPoint) {
        try {
            Class target = joinPoint.getTarget().getClass();
            Field loggerField = target.getDeclaredField(LOGGER_FIELD_NAME);
            loggerField.setAccessible(true);

            return (Logger) loggerField.get(null);
        } catch (NoSuchFieldException e) {
            logger.warn("Field " + LOGGER_FIELD_NAME + " not find, AspectUtils logger Field will be used.");
        } catch (IllegalAccessException e) {
            logger.warn(e.getMessage(), e);
        } catch (Exception e) {
            logger.warn("Field " + LOGGER_FIELD_NAME + " not find or not static, AspectUtils logger Field will be used.");
        }

        return logger;
    }

    /**
     * 组装参数和值
     *
     * @param logLine
     * @param paramNames
     * @param paramValues
     */
    public static void concactParamValues(StringBuilder logLine, String[] paramNames, Object[] paramValues, Class[] paramTypes) {
        for (int i = 0; i < paramNames.length; i++) {
            logLine.append(paramNames[i]).append("=").append(toString(paramValues[i])).append("(").append(paramTypes[i].getName()).append(")");

            if (i < paramNames.length - 1) {
                logLine.append(", ");
            }
        }
    }

    /**
     * 组装参数值
     *
     * @param logLine
     * @param paramValues
     */
    public static void concactParamValues(StringBuilder logLine, Object[] paramValues, Class[] paramTypes) {
        for (int i = 0; i < paramValues.length; i++) {
            logLine.append("var").append(i).append("=").append(toString(paramValues[i])).append("(").append(paramTypes[i].getName()).append(")");

            if (i < paramValues.length - 1) {
                logLine.append(", ");
            }
        }
    }

    /**
     * @param object
     * @return
     */
    public static String toString(Object object) {
        if (null == object) {
            return "<null>";
        }

        if (object.toString().length() > 1000) {
            return object.toString().substring(0, 1000) + "...[more]";
        }

        return object.toString();
    }

    /**
     * Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
     *
     * @param obj
     * @return Map
     */
    public static Map<String, Object> transBeanToMap(Object obj) {
        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            Field[] propertys = obj.getClass().getDeclaredFields();
            PropertyDescriptor[] propertyDescriptors = beanInfo
                    .getPropertyDescriptors();
            for (Field field : propertys) {
                for (PropertyDescriptor property : propertyDescriptors) {
                    String key = property.getName();
                    if (field.getName().equals(key)) {
                        // 过滤class属性
                        if (!key.equals("class")) {
                            // 得到property对应的getter方法
                            Method getter = property.getReadMethod();
                            Object value = getter.invoke(obj);
                            map.put(key, value);
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error("transBean2Map Error " + e);
        }
        return map;
    }
}
