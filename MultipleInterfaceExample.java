interface FirstInterface{
	public void myMethod();
}

interface SecondInterface{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
	public void myMethod(){
		System.out.println("My Method");
	}
	
	public void myOtherMethod(){
		System.out.println("My Other Method");
	}
}

class MultipleInterfaceExample{
	public static void main(String[] args){
		DemoClass myDemoClass = new DemoClass();
		myDemoClass.myMethod();
		myDemoClass.myOtherMethod();
	}

}