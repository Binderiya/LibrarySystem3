package dataaccess;

import java.io.Serializable;
import java.util.List;

public class Author extends Person implements Serializable {

	List <Book> book;

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public Author(String firstName, String lastName, int phoneNumber, Address address, List<Book> book) {
		super( firstName,  lastName,  phoneNumber,  address);
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [book=" + book + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		return true;
	}


}
