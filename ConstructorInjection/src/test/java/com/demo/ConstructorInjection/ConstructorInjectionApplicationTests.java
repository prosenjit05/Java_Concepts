package com.demo.ConstructorInjection;

import com.demo.ConstructorInjection.example1.Author;
import com.demo.ConstructorInjection.example1.Book;
import com.demo.ConstructorInjection.example1.Page;
import com.demo.ConstructorInjection.example1.Publisher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

@SpringBootTest
class ConstructorInjectionApplicationTests {

	Book book;

	@Mock
	Page page;
	@Mock
	Author author;
	@Mock
	Publisher publisher;

	@BeforeEach
	void beforeEachTest(){
		book = new Book(page, author, publisher);
//		ReflectionTestUtils.setField(book,"page",page);
//		ReflectionTestUtils.setField(book,"author",author);
//		ReflectionTestUtils.setField(book,"publisher",publisher);
	}

	@Test
	void test_Book_checkValidBook() {
		book.checkValidBook();
	}

}
