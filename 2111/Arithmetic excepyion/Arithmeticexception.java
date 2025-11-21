package sample;
import java.util.Scanner;
public class Arithmeticexception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("Enter value for a : ");
			int a = sc.nextInt();
			System.out.print("Enter value for b : ");
			int b = sc.nextInt();
			int result = a / b;
			System.out.println("result = " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception has been occured!");
			System.out.println("Exception has been occured!");
		}
		
	}

}
