package dataaccess;

import java.io.Serializable;
import java.util.List;

public class CheckOutRecord  implements Serializable{

	private List<CheckOutRecordEntry> checkOutRecordEntry;
	private Member member;

	public CheckOutRecord(List<CheckOutRecordEntry> checkOutRecordEntry, Member m ){
		this.member=m;
		this.checkOutRecordEntry= checkOutRecordEntry;
	}

	public List<CheckOutRecordEntry> getCheckOutRecordEntry() {
		return checkOutRecordEntry;
	}
	public void setCheckOutRecordEntry(List<CheckOutRecordEntry> checkOutRecordEntry) {
		this.checkOutRecordEntry = checkOutRecordEntry;
	}
	public Member getMember() {
		return member;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckOutRecord other = (CheckOutRecord) obj;
		if (checkOutRecordEntry == null) {
			if (other.checkOutRecordEntry != null)
				return false;
		} else if (!checkOutRecordEntry.equals(other.checkOutRecordEntry))
			return false;
		if (member == null) {
			if (other.member != null)
				return false;
		} else if (!member.equals(other.member))
			return false;
		return true;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "CheckOutRecord [checkOutRecordEntry=" + checkOutRecordEntry + ", member=" + member + "]";
	}

}
