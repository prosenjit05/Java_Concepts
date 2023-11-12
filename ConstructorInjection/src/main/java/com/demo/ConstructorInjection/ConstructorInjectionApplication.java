package com.demo.ConstructorInjection;

import com.demo.ConstructorInjection.example1.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(ConstructorInjectionApplication.class, args);
		//Arrays.asList(appContext.getBeanDefinitionNames()).forEach(System.out::println);

		Book book = appContext.getBean(Book.class);
		book.checkValidBook();
	}

}
