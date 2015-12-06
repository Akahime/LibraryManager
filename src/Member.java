import java.util.ArrayList;
import java.util.Date;

public class Member implements Observer{
	private static int ID;
	private String name;
	private String surname;
	private Date birthDate;
	//Credit card number
	private int ccNumber;
	private ArrayList<Borrowing> currentItems;
	private ArrayList<Borrowing> history;
	private Card card;
	private Library library;
	private boolean unsuspended;
	
	public boolean isUnsuspended() {
		return unsuspended;
	}
	public void setUnsuspended(boolean unsuspended) {
		this.unsuspended = unsuspended;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public static int getID() {
		return ID;
	}
	public static void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}
	public ArrayList<Borrowing> getCurrentItems() {
		return currentItems;
	}
	public void setCurrentItems(ArrayList<Borrowing> currentItems) {
		this.currentItems = currentItems;
	}
	public ArrayList<Borrowing> getHistory() {
		return history;
	}
	public void setHistory(ArrayList<Borrowing> history) {
		this.history = history;
	}
	public Member(String name, String surname, Date birthDate, int ccNumber, Library library) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.ccNumber = ccNumber;
		this.history = new ArrayList<Borrowing>();
		this.currentItems= new ArrayList<Borrowing>();
		this.card= new Card();
		this.library= library;
		this.unsuspended=true;
		
	}
	
	public boolean checkBorrowings(){
		Integer size = (this.getCurrentItems()).size();
		if (size<this.library.getNbi()){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public void update (String title) {
		// TODO Auto-generated method stub
		System.out.println("Vous n'avez toujours pas rendu le livre "+title);
	}
	
	
}
