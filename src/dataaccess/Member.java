package dataaccess;

import java.io.Serializable;
import java.util.List;

public class Member extends Person implements Serializable{

	private int memberid;
	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public List<CheckOutRecord> getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(List<CheckOutRecord> checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}

	List<CheckOutRecord> checkOutRecord;

	public Member(String firstName, String lastName, int phoneNumber, Address address, int memberid) {
		super( firstName,  lastName,  phoneNumber,  address);
		this.memberid = memberid;
	}

	public Member(String firstName, String lastName, int phoneNumber, Address address, int memberid, List<CheckOutRecord> checkOutRecord) {
		super( firstName,  lastName,  phoneNumber,  address);
		this.memberid = memberid;
		this.checkOutRecord = checkOutRecord;
	}

}
