
import java.util.Scanner;

public class Pelindrom_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String a;
		a=sc.nextLine();
		a = a.toLowerCase();

        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);

        }
        
        
        
        
        if(a.equals(rev))
        {
        	System.out.println("the string is a pelindrong string");
        }
        else 
        {
        	System.out.println("the string is not a pelindrong string");
        	
        }

	}

}
