//Thanakorn Pasangthien Section1 6088109
public class Car {
	public double eff;
	public double gas;
	public Car(double efficiencey) {
		eff = efficiencey;
		gas = 0;
	}
	public void drive(double distance) {
		 gas = gas-(distance/eff);
	}
	public void addGas(double litter) {
		gas = gas+litter;
	}
	public double getGasInTank() {
		return gas;
	}
	
}
