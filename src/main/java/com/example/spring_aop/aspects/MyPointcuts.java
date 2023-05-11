package com.example.spring_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* com.example.spring_aop..*.get*(..))")
    public void allGetMethods() {
    }
}
