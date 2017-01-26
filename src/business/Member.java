package business;

import java.util.List;

public class Member extends Person{

	int memberid;
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
