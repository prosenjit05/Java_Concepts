package com.demo.ConstructorInjection.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {

    private Page page;
    private Author author;
    private Publisher publisher;

    @Autowired
    public Book(Page page, Author author, Publisher publisher) {
        this.page = page;
        this.author = author;
        this.publisher = publisher;
    }

//    @Autowired
//    public void setPage(Page page) { this.page = page; }
//    @Autowired
//    public void setAuthor(Author author) { this.author = author; }
//    @Autowired
//    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    public void checkValidBook(){

        //modifyPublisher();
        //this.publisher.printPublishersCount();

        // check if we have both the page and the author for a book
        if(this.page==null || this.author==null || this.publisher==null){
            System.out.println("Invalid Book details !!!");
        } else {
            System.out.println("Valid Book !");
        }

    }

//    public void modifyPublisher(){
//        Publisher publisher1 = new Publisher();
//        publisher1.setMinimumNumberOfPublishers(10);
//        this.publisher = publisher1;
//    }

}
