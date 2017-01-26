package dataaccess;

import java.io.Serializable;

class Librarian extends PersonRole implements Serializable{

	private String password;

	public Librarian(String rolename, String pw) {
		super(rolename);
		this.password= pw;
		// TODO Auto-generated constructor stub
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
