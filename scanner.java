import java.lang.*;
import java.util.*;
 
public class scanner
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String a;
		int b;
		System.out.println("Enter Your Name -> ");
		System.out.println("Enter Your Age -> ");
		a = s.nextLine();
		b = s.nextInt();
		System.out.println("My Name is " + a + " & I am " + b + " Years Old ");
	}
	
}