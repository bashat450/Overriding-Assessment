package Assessment;

import java.util.Scanner;

public class OverridingAssessment {
	String revstring="",str;
	int number, fact=1;
	char my_input;
	Scanner sc = new Scanner(System.in); 
 

	public static void main(String[] args) {
		PalindromeOrNot p = new PalindromeOrNot();
		p.display();
		
		PrimeOrNot pr = new PrimeOrNot();
		pr.display();
		
		FactorialOrNot f = new FactorialOrNot();
		f.display();
		
		CharacterIsVowelOrNot c = new CharacterIsVowelOrNot();
		c.display();
		

	}

}
