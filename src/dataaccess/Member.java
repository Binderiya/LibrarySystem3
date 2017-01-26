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

	public Member(int id, PersonData personData, int memberid) {
		super(id, personData);
		this.memberid = memberid;
	}

	public Member(int id, PersonData personData, int memberid, List<CheckOutRecord> checkOutRecord) {
		super(id, personData);
		this.memberid = memberid;
		this.checkOutRecord = checkOutRecord;
	}

}
