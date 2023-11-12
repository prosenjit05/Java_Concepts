package com.demo.ConstructorInjection.example1;

public class Book {

    private Page page;
    private Author author;

    public Book(Page page, Author author) {
        this.page = page;
        this.author = author;
    }

    public void checkValidBook(){
        // check if we have both the page and the author for a book
        if(this.page==null || this.author==null){
            System.out.println("Invalid Book details !!!");
        } else {
            System.out.println("Valid Book !");
        }

    }

}
