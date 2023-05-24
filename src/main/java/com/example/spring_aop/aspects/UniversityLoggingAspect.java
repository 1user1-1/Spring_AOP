package com.example.spring_aop.aspects;


import com.example.spring_aop.Student;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentLoggingAdvice(){
//        System.out.println("beforeGetStudentLoggingAdvice:" +
//                "logging of getting a list of student before method GetStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningStudentLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " +nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//
//        System.out.println("afterReturningStudentLoggingAdvice:" +
//                "logging of getting a list of student after method GetStudents");
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentLoggingAdvice(){
        System.out.println("afterGetStudentLoggingAdvice: logging is normal - end of work or exception ");
    }
    }
