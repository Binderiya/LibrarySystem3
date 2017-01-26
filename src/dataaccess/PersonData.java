package dataaccess;

import java.io.Serializable;

public class PersonData implements Serializable {
	private static final long serialVersionUID = 8309080721495266420L;
	String firstName;
	String lastName;
	int phoneNumber;
	//Address address;

	public PersonData(String firstName, String lastName, int phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		//this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		return (this.firstName.equals(((PersonData) obj).firstName)
				&& this.lastName.equals(((PersonData) obj).lastName) && this.phoneNumber
					==((PersonData) obj).phoneNumber);
	}

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getPhoneNumber();
	}
}