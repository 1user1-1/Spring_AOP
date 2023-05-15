package com.example.spring_aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary{
    public void getBook(){
        System.out.println("We take a book from UniLibrary:");
        System.out.println("-----------------------------------------");
    }

    public void returnBook(){
        System.out.println("We return a book to uniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void getMagazine(){
        System.out.println("We take a magazine from UniLibrary");
        System.out.println("-----------------------------------------");
    }


    public void returnMagazine(){
        System.out.println("We return a magazine to UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("We add a book to uniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add a magazine to uniLibrary");
        System.out.println("-----------------------------------------");
    }

}
