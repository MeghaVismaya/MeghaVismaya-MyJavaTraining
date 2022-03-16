package training.java.polymorphism.methodoverriding1;

public class Sale {
	private String season;
	private int totalPrice;
	private int discount;
	
	public void discount()
	{
	if(season.equalsIgnoreCase("Onseason"))
	{
		setDiscount(40);
	}
	else
	{
		setDiscount(15);	
	}
	
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
