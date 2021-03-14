interface Bicycle{
	void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBreaks(int decrement);
}

class FireFox implements Bicycle{
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	public void changeCadence(int newValue){
		cadence = newValue;
	}

	public void changeGear(int newValue){
		gear = newValue;
	}
	
	public void speedUp(int increment){
		speed = speed + 1;
	}
	
	public void applyBreaks(int decrement){
		speed = speed - decrement;
	}
	
	void printStates(){
		System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear: " + gear);
	}

}

class BicycleInterfaceExample{
	public static void main(String[] args){
		FireFox myBicycle = new FireFox();
		myBicycle.changeCadence(1);
		myBicycle.changeGear(3);
		myBicycle.speedUp(10);
		myBicycle.printStates();
		
	}
}