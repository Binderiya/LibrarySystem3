package dataaccess;

import java.io.Serializable;

public class CopyOfBook implements Serializable{
	private int idCopy;
	public int getIdCopy() {
		return idCopy;
	}
	public void setIdCopy(int idCopy) {
		this.idCopy = idCopy;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	private Book book;
	public CopyOfBook(int idCopy, Book book) {
		super();
		this.idCopy = idCopy;
		this.book = book;
	}

}
