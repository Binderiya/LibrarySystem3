package dataaccess;

import java.io.Serializable;
import java.util.Date;

public class CheckOutRecordEntry implements Serializable {

	private CheckOutRecord checkOutRecord;
	private Date checkOutDate;
	private Date dueDate;
	private Date returnDate;



	public CheckOutRecord getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(CheckOutRecord checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public CheckOutRecordEntry(CheckOutRecord checkOutRecord, Date checkOutDate, Date dueDate, Date returnDate) {
		super();
		this.checkOutRecord = checkOutRecord;
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "CheckOutRecordEntry [checkOutRecord=" + checkOutRecord + ", checkOutDate=" + checkOutDate + ", dueDate="
				+ dueDate + ", returnDate=" + returnDate + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckOutRecordEntry other = (CheckOutRecordEntry) obj;
		if (checkOutDate == null) {
			if (other.checkOutDate != null)
				return false;
		} else if (!checkOutDate.equals(other.checkOutDate))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		return true;
	}


}
