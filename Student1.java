import java.util.Scanner;

interface MathsInterfaceExample {
	public void add();
	public void sub();
	public void mul();
	public void div();
}


class student1 implements MathsInterfaceExample {
         public void add() {
			 Scanner kb = new Scanner(System.in);
			 System.out.println("Enter any two integer values to perform addition");
			 int a=kb.nextInt();
			 int b=kb.nextInt();
			 int s=a+b;
			 System.out.println("Sum of "+a+" and "+b+" is "+s);
			}

         public void sub() {
			 Scanner kb = new Scanner(System.in);
			 System.out.println("Enter any two integer values to perform substraction");
			 int a=kb.nextInt();
			 int b=kb.nextInt();
			 int s=a-b;
			 System.out.println("Difference of "+a+" and "+b+" is "+s);
			}

         public void mul() {
			 Scanner kb = new Scanner(System.in);
			 System.out.println("Enter any two integer values multiplication");
			 int a=kb.nextInt();
			 int b=kb.nextInt();
			 int s=a*b;
			 System.out.println("Product of "+a+" and "+b+" is "+s);
			}
        
		 public void div() {
			 Scanner kb = new Scanner(System.in);
			 System.out.println("Enter any two integer values division");
			 int a=kb.nextInt();
			 int b=kb.nextInt();
			 int s=a/b;
			 System.out.println("Quotient of "+a+" and "+b+" is "+s);
  }
public static void main(String[] args) {
   student1 Edureka1 = new student1();
   Edureka1.add();
   Edureka1.sub();
   Edureka1.mul();
   Edureka1.div();
   }
}