import java.lang.reflect.Array;
import java.util.Date;

public class DVD extends LibraryItem{
	private int borrowingDuration;

	public int getBorrowingDuration() {
		return borrowingDuration;
	}

	public void setBorrowingDuration(int borrowingDuration) {
		this.borrowingDuration = borrowingDuration;
	}

	public DVD(String title, String publisher, int publishingYear, int volumeNumber, ConsultationType consultationType,
			 double length, double height, double width, Location location) {
		super(title, publisher, publishingYear, volumeNumber, consultationType, length, height, width, location);
		this.borrowingDuration=2;
	}

	
	
}
