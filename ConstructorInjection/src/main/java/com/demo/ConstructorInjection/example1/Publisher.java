package com.demo.ConstructorInjection.example1;

import org.springframework.stereotype.Component;

@Component
public class Publisher {

    private Integer minimumNumberOfPublishers = 1;

    public void setMinimumNumberOfPublishers(Integer minimumNumberOfPublishers) {
        this.minimumNumberOfPublishers = minimumNumberOfPublishers;
    }

    public void printPublishersCount(){
        System.out.println("Minimum number of publishers are: " + minimumNumberOfPublishers);
    }

}
