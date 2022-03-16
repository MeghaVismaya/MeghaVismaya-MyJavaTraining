package training.java.polymorphism.methodoverriding;

public class Sale {
	public static void main(String[] args) {
		OnSeason os = new OnSeason();
		os.setTotalPrice(1000);
		os.setSeason("onSeason");
		os.discount();
	}
}
