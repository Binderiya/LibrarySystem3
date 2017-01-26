package dataaccess;

import java.io.Serializable;

public class Address implements Serializable {

	private String street;
	private String city;
	private String state;
	private int zip;

	public Address(String street, String city, String state, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}



	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public boolean equals(Object obj) {
		return (this.street.equals(((Address) obj).street) && this.city.equals(((Address) obj).city)
			&& this.state.equals((((Address) obj).state))	&& this.zip == ((Address) obj).zip);
	}



	@Override
	public String toString() {
		return "Address is :street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + " ";
	}
}
