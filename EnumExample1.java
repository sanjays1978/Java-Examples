	enum Level{
	LOW, 
	MEDIUM, 
	HIGH
}

public class EnumExample1{
	
	public static void main(String[] args){
		Level myVar = Level.HIGH;

		switch(myVar){
			case LOW:
				System.out.println("Low Level");
				break;
			case MEDIUM:
				System.out.println("Medium Level");
				break;
			case HIGH:
				System.out.println("High Level");
				break;
			
		}
		

		
	}
}

