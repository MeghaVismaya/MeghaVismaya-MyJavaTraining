package training.java.polymorphism.methodoverriding1;

public class OnSeason extends Sale {

	@Override
	public void discount() {
		int priceDrop = 0;
		int onseasonPrice = 0;
		setSeason("onseason");
		super.discount();
		priceDrop = getTotalPrice() * getDiscount() / 100;
		onseasonPrice = getTotalPrice() - priceDrop;
		System.out.println("Price after discount during Onseason " + onseasonPrice);
	}

}
