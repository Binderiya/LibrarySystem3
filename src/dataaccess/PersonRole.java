package dataaccess;

import java.io.Serializable;

public class StaffRole implements Serializable {
  private String roleName;

  public StaffRole(String rolename){
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
	StaffRole other = (StaffRole) obj;
	if (roleName == null) {
		if (other.roleName != null)
			return false;
	} else if (!roleName.equals(other.roleName))
		return false;
	return true;
}



}
