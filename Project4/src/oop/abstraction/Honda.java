package oop.abstraction;

public class Honda extends HybridHonda implements Car{
	
	public void start(){
		System.out.println("Start will Start the car to drive");
	}
	public void stop() {
		System.out.println("Stop will stop the car from driving");
	}
	public void park() {
		System.out.println("P grear Puts car on Park gear");
	}
	public void neutral() {
		System.out.println("N Grear Puts car on Neutral gear");
	}
	public void thirdGear(){
		System.out.println("3rd Puts car in Third gear");
	}
	public void GasEngine() {
		System.out.println("Gas powered Honda has a combustion Engine");
	}
	public void GasBattery() {
		System.out.println("Gas powered Honda has 1 Battery");
	}
	public void HybridEngine() {
		System.out.println("Hybrid Honda has a different Engine");
	}
	public void HybridBattery() {
		System.out.println("Hybrid Honda has a seperate extra Battery");
	}
	
}