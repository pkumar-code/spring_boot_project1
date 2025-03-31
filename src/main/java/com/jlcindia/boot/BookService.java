package com.jlcindia.boot;

import java.util.List;

public interface BookService {
	
	public List<Book>getAllBooks();
	public List<Book>getAllBooks(int start,int total);
	
	public Book getBookById(Integer bid);
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Integer bid);
	public long getBooksCount();
	

}
