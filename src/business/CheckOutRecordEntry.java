package business;

import java.util.Date;

public class CheckOutRecordEntry {

	CheckOutRecord checkOutRecord;
	public CheckOutRecordEntry(CheckOutRecord checkOutRecord, Date checkOutDate, Date dueDate, Date returnDate) {
		super();
		this.checkOutRecord = checkOutRecord;
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
	}
	Date checkOutDate;
	Date dueDate;
	Date returnDate;

}
