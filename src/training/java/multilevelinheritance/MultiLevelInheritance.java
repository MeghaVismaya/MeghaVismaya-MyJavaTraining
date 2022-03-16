package training.java.multilevelinheritance;

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Car cr = new Car();
		cr.setBrand("Audi");
		cr.setColor("White");
		cr.setModelNo("Z Series");
		cr.setBuildYear(2020);
		cr.setFuel("Diesel");
		cr.setDriveTrain("2WD");
		cr.setTotalAirbags(2);
		cr.setBodyStyle("Sedan");
		cr.setSports(true);
		cr.displayFeatures();
	}
}
