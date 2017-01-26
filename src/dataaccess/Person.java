package dataaccess;

import java.io.Serializable;

class Person implements Serializable{

	private int id;
	private PersonData personData;

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

	@Override
	public String toString() {
		return "Person [id=" + id + ", personData=" + personData + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void setPersonData(PersonData personData) {
		this.personData = personData;
	}


}
