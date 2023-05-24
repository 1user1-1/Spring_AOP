package com.example.spring_aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object  aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice:" +
                " try to return book to the library");
        Object targetMethodResult = null;
        try{
            targetMethodResult =  proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice:" +
                    "caught exception "+ e);
            targetMethodResult = "Unknown name of the book";
        }


        System.out.println("aroundReturnBookLoggingAdvice:" +
                " completely returning book to the library");

        return targetMethodResult;
    }

}
