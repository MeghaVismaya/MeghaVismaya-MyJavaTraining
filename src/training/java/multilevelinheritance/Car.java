package training.java.multilevelinheritance;

public class Car extends FourWheeler {

	private boolean isSports;
	private String bodyStyle;

	public void displayFeatures() {
		System.out.println("Brand :" + getBrand());
		System.out.println("Color :" + getColor());
		System.out.println("Model No :" + getModelNo());
		System.out.println("Build Year :" + getBuildYear());
		System.out.println("Fuel :" + getFuel());
		System.out.println("DriveTrain :" + getDriveTrain());
		System.out.println("No of Airbags :" + getTotalAirbags());
		System.out.println("Sports Car:" + isSports());
		System.out.println("Car Body Style :" + getBodyStyle());
	}

	public boolean isSports() {
		return isSports;
	}

	public void setSports(boolean isSports) {
		this.isSports = isSports;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

}
