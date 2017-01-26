package dataaccess;

import java.io.Serializable;
import java.util.List;

public class Author extends Person implements Serializable {

	List <Book> book;

	public Author(int id, PersonData personData, List<Book> book) {
		super(id, personData);
		this.book = book;
	}


}
