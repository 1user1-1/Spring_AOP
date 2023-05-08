package com.example.spring_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.example.spring_aop..*.get*(..))")
    public void allMethodsInPackage() {
    }

    @Before("allMethodsInPackage()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: logging the attempt to get a book or a magazine");
    }

    @Before("allMethodsInPackage()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: checking the right to get a book or a magazine");
    }
}