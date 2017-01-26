package dataaccess;

import java.io.Serializable;

public class PersonRole implements Serializable {
  private String roleName;

  public PersonRole(String rolename){
	  this.roleName= rolename;

  }

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}

@Override
public String toString() {
	return "StaffRole , roleName= " + roleName + " ";
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PersonRole other = (PersonRole) obj;
	if (roleName == null) {
		if (other.roleName != null)
			return false;
	} else if (!roleName.equals(other.roleName))
		return false;
	return true;
}



}
