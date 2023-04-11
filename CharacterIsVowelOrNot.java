package Assessment;
//import java.util.Scanner;

public class CharacterIsVowelOrNot extends OverridingAssessment{
	//@override
	public void display() {
//		char my_input;
	      // Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the character to check character is vowel or consonent : ");
	      my_input = sc.next().charAt(0);
	      if(my_input == 'a' || my_input == 'e' || my_input == 'i' || my_input == 'o' || my_input == 'u' )
	         System.out.println("The character : " +my_input + " is a vowel");
	      else
	         System.out.println("The character : " +my_input + " is a consonant");
		  

	}

}
