package training.java.hierarchicalinheritance;

public class Bowler extends Cricketer {
	private int totalWickets;
	private String bowlingStyle;
	private float bowlingSpeed;

	public void display() {

		System.out.println("Player Name :" + getPlayerName());
		System.out.println("Jersey Nunber :" + getJerseyNo());
		System.out.println("Bowling Style :" + getBowlingStyle());
		System.out.println("Total Wickets :" + getTotalWickets());
		System.out.println("Average Bowling speed (in km/hr) :" + getBowlingSpeed());
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public int getTotalWickets() {
		return totalWickets;
	}

	public void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	public float getBowlingSpeed() {
		return bowlingSpeed;
	}

	public void setBowlingSpeed(float bowlingSpeed) {
		this.bowlingSpeed = bowlingSpeed;
	}

}
