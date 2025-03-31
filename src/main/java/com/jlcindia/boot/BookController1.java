package com.jlcindia.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BookController1 {

	@Autowired
	BookService bookService;
	
	
	/*
	 * @GetMapping("/") public String showIndexPage() {
	 * System.out.println("-----------ShowIndexPage()--------"); return "index"; }
	 */
	 

	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		System.out.println("BookController-getAllBooks");
		List<Book> blist = bookService.getAllBooks();
		return blist;
	}

	@PostMapping("/addBook")
	public List<Book> addBook(@RequestBody Book book) {
		System.out.println("BookController -addBook");
		bookService.addBook(book);

		return getAllBooks();
	}

	@PutMapping("/updateBook")
	public List<Book> updateBook(@RequestBody Book book) {
		System.out.println("BookController - updateBook");
		bookService.updateBook(book);

		return getAllBooks();
	}

	@PostMapping("/deleteBook/{bid}")
	public List<Book> deleteBook(@PathVariable Integer bid) {

		System.out.println("BookController -deleteBook");
		bookService.deleteBook(bid);

		return getAllBooks();
	}

//	@GetMapping("/viewBook/{bid}")
//	public Book viewBook(@PathVariable Integer bid) {
//		System.out.println("BookController - viewBook"+bid);
//		Book book = bookService.getBookById(bid);
//      System.out.println("ViewBook "+book);
//		return book;
//	}
	
	@GetMapping("/viewBook/{bookId}")
	public Book viewBook(@PathVariable("bookId") String bid) {
		System.out.println("BookController - viewBook"+bid);
		Book book = bookService.getBookById(Integer.parseInt(bid));
		  System.out.println("ViewBook "+book);
		return book;
	}

}
