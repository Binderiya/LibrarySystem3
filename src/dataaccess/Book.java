package dataaccess;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
	private int day;
	private String title;
	private int isbn;
	private boolean available;
	private List<Author> author;
	private CopyOfBook copyOfBook;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	public CopyOfBook getCopyOfBook() {
		return copyOfBook;
	}

	public void setCopyOfBook(CopyOfBook copyOfBook) {
		this.copyOfBook = copyOfBook;
	}

	public Book(int day, String title, int isbn, boolean available, List<Author> author, CopyOfBook copyOfBook) {
		super();
		this.day = day;
		this.title = title;
		this.isbn = isbn;
		this.available = available;
		this.author = author;
		this.copyOfBook = copyOfBook;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (available != other.available)
			return false;
		if (day != other.day)
			return false;
		if (isbn != other.isbn)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
