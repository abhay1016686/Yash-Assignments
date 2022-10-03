package com.yash.practice;

import java.util.ArrayList;
import java.util.List;

import com.yash.practice.model.Book;

public class BookAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> booklist= new ArrayList<Book>();
		BookAuthor bookAuthor = new BookAuthor();
		Book b1= new Book("Book1", 250, "Educational","Abhay");
		Book b2= new Book("Book2", 270, "Drama","Amol");
		Book b3= new Book("Book3", 280, "Horror","Ajinkya");
		Book b4= new Book("Book4", 290, "Darma","Abhay");
		Book b5= new Book("Book5", 300, "Educational","Amol");
		
		booklist.add(b1);booklist.add(b2);booklist.add(b3);booklist.add(b4);booklist.add(b5);
		
		System.out.println(bookAuthor.getCountByAuthor("Amol",booklist));
		
	}

	public String getCountByAuthor(String authorName,List<Book> bookList) {
		int count=0;
		for (Book book : bookList) {
			if(authorName.equals(book.getBookAuthor())){
				count++;
			}
		}
		
		return count+" book/s written by "+authorName+" !!";
		
	}
	
	

}
