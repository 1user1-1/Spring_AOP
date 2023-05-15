package com.example.spring_aop.aspects;

import com.example.spring_aop.Book;
import jdk.jshell.MethodSnippet;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspect {


//    @Pointcut("execution(* com.example.spring_aop..*.*(..))")
//    private void allMethodsFromUniLibrary(){}
//    @Pointcut("execution(public void com.example.spring_aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }
//    @Pointcut("execution(* com.example.spring_aop..*.get*(..))")
//    private void allGetMethodsFromUniLibrary(){}
//
//
//    @Pointcut("execution(* com.example.spring_aop..*.return*(..))")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
//


    @Before("com.example.spring_aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = "+methodSignature);
        System.out.println("methodSignature.getMethod() = "
                +methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "
                +methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "
                +methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Information about a book: name - "+
                            myBook.getName() + ", author - "+myBook.getAuthor()+
                            ", year of publication - "+myBook.getYearOfPublication());
                }else if(obj instanceof String){
                    System.out.println("Book has been added by "+ obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: logging" +
                " the attempt to get a book or a magazine");
        System.out.println("-----------------------------------------");
    }


}