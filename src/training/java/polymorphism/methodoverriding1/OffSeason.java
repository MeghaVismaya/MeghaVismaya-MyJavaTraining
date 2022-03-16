package training.java.polymorphism.methodoverriding1;

public class OffSeason extends Sale {

	@Override
	public void discount() {
		int priceDrop = 0;
		int offseasonPrice = 0;
		setSeason("offseason");
		super.discount();
		priceDrop = getTotalPrice() * getDiscount() / 100;
		offseasonPrice = getTotalPrice() - priceDrop;
		System.out.println("Price after discount during Offseason " + offseasonPrice);
	}

}
