	enum Level{
	LOW, 
	MEDIUM, 
	HIGH
}

public class EnumExampleForLoop{
		public static void main(String[] args){
			for(Level myVar : Level.values()){
				System.out.println(myVar);
			}
		}
}