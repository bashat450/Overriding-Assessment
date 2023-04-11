package Assessment;
//import java.util.Scanner;

public class FactorialOrNot extends OverridingAssessment {
	//@override
	public void display() {
		//int i,fact=1; 
		System.out.print("Enter a number to factorial : ");
		//Scanner sc = new Scanner(System.in);
		number = sc.nextInt();    
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is : "+fact);    
	}

}
