package dataaccess;

import java.io.Serializable;
import java.util.List;

public class StaffMember extends Person implements Serializable {

	List <StaffRole> staffrole;
	public StaffMember(int id, PersonData personData) {
		super(id, personData);
	}
	public StaffMember(int id, List<StaffRole> staffrole, String password) {
		super(id);
		this.staffrole = staffrole;
	}

}
