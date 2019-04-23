package com.you.you.page.server.back.config;

import com.you.you.page.common.util.AspectUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * controller调用切面
 * 打印调用参数及返回结果
 *
 * @author follow
 * @title controller调用切面
 * @date 2018/4/15
 * @since 1.0-SNAPSHOT.0
 */
@Aspect
@Component
public class ControllerAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.you.you.page.server.back.controller..*.*(..))")
    public void executeService() {
    }

    /**
     * 执行方法前后记录日志
     *
     * @param joinPoint
     * @return
     * @title joinPoint
     * @tables <涉及表说明，便于调用方调试>
     * @special <特殊说明>
     * @author yvan
     * @date 2018/4/14
     * @since 1.0-SNAPSHOT.0
     */
    @Around("executeService()")
    public Object doAroundLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = ((MethodSignature) joinPoint.getSignature());

        Class[] paramTypes = methodSignature.getParameterTypes();
        String[] paramNames = methodSignature.getParameterNames();
        Object[] paramValues = joinPoint.getArgs();
        String className = joinPoint.getTarget().getClass().getName();

        StringBuilder logLine = new StringBuilder(className).append("-").append(joinPoint.getSignature().getName()).append("{");

        if (null != paramNames && paramNames.length > 0) {
            AspectUtils.concactParamValues(logLine, paramNames, paramValues, paramTypes);
        }
        logLine.append("} - started");
        logger.info(logLine.toString());

        Object returnValue = null;
        returnValue = joinPoint.proceed();
        if (null != returnValue) {
            logLine.setLength(0);
            logLine.append("Return Value: ");
            logLine.append(className).append("-");
            logLine.append(joinPoint.getSignature().getName()).append("{");
            logLine.append(AspectUtils.toString(returnValue));
            logLine.append("} - finished");
            logger.info(logLine.toString());
        }
        return returnValue;
    }

}
