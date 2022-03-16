package training.java.hierarchicalinheritance;

public class Batsman extends Cricketer {
	private int totalRuns;
	private int totalCenturies;

	public void display() {

		System.out.println("Player Name :" + getPlayerName());
		System.out.println("Jersey Nunber :" + getJerseyNo());
		System.out.println("Total Runs :" + getTotalRuns());
		System.out.println("Total Centuries :" + getTotalCenturies());
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getTotalCenturies() {
		return totalCenturies;
	}

	public void setTotalCenturies(int totalCenturies) {
		this.totalCenturies = totalCenturies;
	}

}
