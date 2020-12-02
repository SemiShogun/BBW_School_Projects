package Aufgabe2;

public class Payment {
	private String cardnumber;
	private String date;
	private String amount;
	
	public Payment(String cardnumber, String date, String amount) {
		super();
		this.cardnumber = cardnumber;
		this.date = date;
		this.amount = amount;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [cardnumber=" + cardnumber + ", date=" + date + ", amount=" + amount + "]";
	}
}
