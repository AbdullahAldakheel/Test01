package assignmentWesam;



public class LapTop extends Equipment {
	private String screenSize;
	private int nbCores;
	public LapTop (String serNB , String br , double pr , int scrSize, int nbC) {
		super(serNB,br,pr);
		this.screenSize="scrSize";
		this.nbCores=nbC;
	}
	public LapTop (LapTop LP) {
		super(LP);
		this.screenSize=LP.screenSize;
		this.nbCores=LP.nbCores;
	}
	public double computeMaintenance() throws Exception {
		double cost = (super.price*0.01) + (nbCores*200);
		return cost;
	}

}
