package training.java.polymorphism.methodoverriding;

public class OnSeason extends OffSeason {
	private String season;
	

	@Override
	public void discount() {
		if (season.equalsIgnoreCase( "onseason")) {
			int priceDrop=0;
			priceDrop = (int) getTotalPrice() * 40 / 100;
			setDiscount(priceDrop);
			System.out.println("Discount Amount " + priceDrop);
		} else {
			super.discount();
		}
	}

	public void setSeason(String season) {
		this.season = season;
	}

}
