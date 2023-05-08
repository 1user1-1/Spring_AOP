package com.example.spring_aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary{
    public void getBook(){
        System.out.println("We take a book from UniLibrary:");
    }

//    String returnBook(){
//        System.out.println("We return a book to uniLibrary");
//        return "OK";
//    }

    public void getMagazine(){
        System.out.println("We take a magazine from UniLibrary");
    }

}
