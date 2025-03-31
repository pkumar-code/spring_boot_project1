package com.jlcindia.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDAO bookDAO;

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.findAll();
	}

	@Override
	public List<Book> getAllBooks(int start, int total) {
		
		Pageable page1=PageRequest.of(start,total);
	
				List<Book> mybooks=bookDAO.getAllBook(page1);
				System.out.println("-----Pageable ------"+mybooks);
				return mybooks;
	}

	@Override
	public Book getBookById(Integer bid) {
		// TODO Auto-generated method stub
		return bookDAO.findById(bid).get();
	}

	@Override
	public void addBook(Book book) {
		bookDAO.save(book);
		
	}

	@Override
	public void updateBook(Book book) {
		bookDAO.saveAndFlush(book);
		
	}

	@Override
	public void deleteBook(Integer bid) {
		
		bookDAO.deleteById(bid);
		
	}

	@Override
	public long getBooksCount() {
		
		long count=bookDAO.countBookByBidNotNull();
		System.out.println(count);
		
		return count;
	}

}
