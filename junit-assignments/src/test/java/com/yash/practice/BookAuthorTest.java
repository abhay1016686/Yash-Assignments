package com.yash.practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.practice.model.Book;

public class BookAuthorTest {
	List<Book> booklist= new ArrayList<Book>();
	BookAuthor bookAuthor = new BookAuthor();
	Book b1= new Book("Book1", 250, "Educational","Abhay");
	Book b2= new Book("Book2", 270, "Drama","Amol");
	Book b3= new Book("Book3", 280, "Horror","Ajinkya");
	Book b4= new Book("Book4", 290, "Darma","Abhay");
	Book b5= new Book("Book5", 300, "Educational","Amol");
	
	
	@Test
	public void testGetCountByAuthor() {
		booklist.add(b1);booklist.add(b2);booklist.add(b3);booklist.add(b4);booklist.add(b5);
		
		assertEquals("2 book/s written by Amol !!", bookAuthor.getCountByAuthor("Amol",booklist));
	}

}
