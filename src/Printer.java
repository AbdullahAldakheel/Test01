package assignmentWesam;

public class Printer extends Equipment {

	private int speed;
	public Printer(String serNB , String br , double pr , int speed) {
		super(serNB,br,pr);
		this.speed=speed;
	}
	public Printer (Printer P) {

		super(P);
		this.speed=P.speed;
	}
	public int getSpeed() {
		return speed;
	}
	public double computeMaintenance()throws Exception {
		double cost= (super.price*0.02) + (speed*100);
		return cost;
	}

	


}
