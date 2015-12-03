
public class Card {
	private CardType type;
	private Date expirationDate;
	public CardType getType() {
		return type;
	}
	public void setType(CardType type) {
		this.type = type;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Card(CardType type, Date expirationDate) {
		super();
		this.type = type;
		this.expirationDate = expirationDate;
	}
	
}