package business;

import java.util.List;

public class Author extends Person {

	List <Book> book;

	public Author(int id, PersonData personData, List<Book> book) {
		super(id, personData);
		this.book = book;
	}


}
