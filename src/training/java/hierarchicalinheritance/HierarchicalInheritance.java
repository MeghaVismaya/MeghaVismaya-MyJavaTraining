package training.java.hierarchicalinheritance;

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Batsman bm = new Batsman();
		bm.setPlayerName("Virat Kohli");
		bm.setJerseyNo(4);
		bm.setTotalRuns(10000);
		bm.setTotalCenturies(89);
		bm.display();
		System.out.println();
		Bowler bw = new Bowler();
		setBowler(bw);
		bw.display();
	

	}

	private static void setBowler(Bowler bw) {
		bw.setPlayerName("Sreeshanth");
		bw.setJerseyNo(10);
		bw.setBowlingStyle("Spinner");
		bw.setBowlingSpeed(234);
		bw.setTotalWickets(100);
	}

}
