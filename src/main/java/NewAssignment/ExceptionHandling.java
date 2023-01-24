package NewAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	try {
		
		
		try {
			System.out.println("Enter the value of X=");
			@SuppressWarnings("removal")
			int x = new Integer(sc.nextInt());
			
			System.out.println("Enter the value of Y=");
			@SuppressWarnings("removal")
			int y = new Integer(sc.nextInt());
			
			System.out.println(""+(x/y));
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}catch (Exception e) {
		System.out.println(e);
	}
		
	
	

}
}