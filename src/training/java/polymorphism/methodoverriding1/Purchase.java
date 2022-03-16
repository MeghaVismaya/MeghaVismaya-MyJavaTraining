package training.java.polymorphism.methodoverriding1;

public class Purchase {
	public static void main(String[] args) {
		String season = "Onseason";
		if (season.equalsIgnoreCase("Onseason")) {
			Sale onseason= new OnSeason();
			onseason.setTotalPrice(1000);
			onseason.discount();
		} else {
			Sale offseason=new OffSeason();
			offseason.setTotalPrice(1000);
			offseason.discount();
		}

	}
}
