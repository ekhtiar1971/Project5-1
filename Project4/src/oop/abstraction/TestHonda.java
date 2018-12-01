package oop.abstraction;

public class TestHonda {

	public static void main(String[] args) {
		Honda car = new Honda();
		car.start();
		car.stop();
		car.neutral();
		car.thirdGear();
		car.park();
	
	Honda Accord = new Honda();
	System.out.println("Honda Accord");
	Accord.GasEngine();
	Accord.park();
	Accord.neutral();
	
	HybridHonda Civic = new Honda();
	System.out.println("Honda Civic");
	Civic.HybridBattery();
	Civic.HybridEngine();
	
	
	Lamborghini Murcialago = new Lamborghini();
	System.out.println("Lamborghini Mucialago");
	Murcialago.Turbo();
	Murcialago.Superchagre();
	Murcialago.Horsepower();
	Murcialago.Torque();
		
	}
		
	
}
