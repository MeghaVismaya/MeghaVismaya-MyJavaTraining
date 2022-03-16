package training.java.polymorphism.methodoverriding;

public class OffSeason {
	private int totalPrice;
	private int discount;

	public void discount() {
		discount = (int) totalPrice * 15 / 100;
		System.out.println("Discount Amount " + discount);
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
