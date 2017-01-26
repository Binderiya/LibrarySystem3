package business;

import java.io.Serializable;

class Person implements Serializable{

	int id;
	PersonData personData;

	public Person(int id) {
		super();
		this.id = id;
	}

	public Person(int id, PersonData personData) {
		super();
		this.id = id;
		this.personData = personData;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PersonData getPersonData() {
		return personData;
	}

	public void setPersonData(PersonData personData) {
		this.personData = personData;
	}
	

}
