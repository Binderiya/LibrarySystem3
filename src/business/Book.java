package business;

import java.util.List;

public class Book {
	int day;
	String title ;
	int isbn;
	boolean available;
	List<Author> author;
	CopyOfBook copyOfBook;
	public Book(int day, String title, int isbn, boolean available, List<Author> author, CopyOfBook copyOfBook) {
		super();
		this.day = day;
		this.title = title;
		this.isbn = isbn;
		this.available = available;
		this.author = author;
		this.copyOfBook = copyOfBook;
	}

}
