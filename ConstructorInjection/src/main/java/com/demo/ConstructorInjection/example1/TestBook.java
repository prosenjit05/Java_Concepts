package com.demo.ConstructorInjection.example1;

public class TestBook {

    public static void main(String[] args) {
        Book book = new Book(new Page(), new Author());

        book.checkValidBook();
    }

}
