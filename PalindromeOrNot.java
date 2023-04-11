package Assessment;
//import java.util.Scanner;

public class PalindromeOrNot extends OverridingAssessment {
	
    //@override
	public void display() {
		//String revstring="";
		System.out.print("Enter a string/number to check string/number is palindrome or not : ");
		//Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		 
		if(revstring.equalsIgnoreCase(str)){
		System.out.println("The string/number is Palindrome");
		}
		else{
		System.out.println("The string/number is Not Palindrome");
		}
	}

}
