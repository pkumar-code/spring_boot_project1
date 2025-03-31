package com.jlcindia.boot;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="mybooks")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bid")
	private Integer bid;
	
	@Column(name="bname")
	private String bname;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private double price;
	
	@Column(name="category")
	private String category;
	
	@Column(name="pub")
	private String pub;
	
	public Book() {}

	public Book(Integer bid, String bname, String author, double price, String category, String pub) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.category = category;
		this.pub = pub;
	}
	public Book( String bname, String author, double price, String category, String pub) {
		
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.category = category;
		this.pub = pub;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	@Override
	public String toString() {
		return bid + "\t" + bname + "\t" + author + "\t" + price + "\t"+ category + "\t" + pub ;
	}
	

}
