class Dog{
	String name;
	public void bark(){
		System.out.println(name + " says Ruff!");
	}
	public void eat(){
	}
	public void chaseCat(){
	}
	
	public static void main(String[] args){
		// make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		
		dog1.name = "Bart";
		
		// now make a dog array
		Dog[] myDogs = new Dog[3];
		
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Merge";
		
		System.out.print("last dog name is ");
		System.out.println(myDogs[2].name);

		int x = 0;
		while(x < myDogs.length){
			myDogs[x].bark();
			x = x + 1;
		}
		
	}
	
	
}