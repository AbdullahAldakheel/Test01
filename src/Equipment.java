
import java.io.Serializable;

public abstract class Equipment implements Serializable {
	private String serialNo;
	private String brand;
	protected double price;
	public Equipment(String serNB , String br , double pr) {
		this.serialNo=serNB;
		this.brand=br;
		this.price=pr;
	}
	public Equipment (Equipment E) {
		this.serialNo=E.serialNo;
		this.brand=E.brand;
		this.price=E.price;
	}
	public abstract double computeMaintenance()throws Exception;

}
