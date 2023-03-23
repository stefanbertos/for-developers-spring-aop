package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    // see https://docs.spring.io/spring-framework/docs/6.0.3/reference/html/core.html#aop

    @Before("execution(public * com.example.demo.*.*(..))")
    public void doBeforeCheck(JoinPoint jp) {
       log.info("doBeforeCheck");
    }

    @AfterReturning(pointcut = "execution (* com.example.demo.*.*(..))",  returning="retVal")
    public void doReturnCheck(JoinPoint jp, Object retVal) {
        log.info("doReturnCheck");
    }

    @AfterThrowing(pointcut = "within(com.example.demo.*)" +
            "", throwing = "e")
    public void doRecoveryActions(Throwable e) {
        log.error("doRecoveryActions");
    }
}
