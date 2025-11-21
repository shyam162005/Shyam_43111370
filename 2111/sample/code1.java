package sample;
import java.util.Scanner;

class code2{
	int sum(int n, int a) {
		int add = n + a;
		return add;
	}
	int sub(int n , int a) {
		int sub = n - a;
		return sub;
	}
	int mul(int n, int a) {
		int mul = n * a;
		return mul;
	}
}
public class code1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		final int n = 100;
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		
		code2 c2 = new code2();
		System.out.println("Sum = "+c2.sum(n,a));
		System.out.println("Sub = "+c2.sub(n,a));
		System.out.println("mul = "+c2.mul(n,a));
	}

}
