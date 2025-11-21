package sample;
import java.util.Scanner;
public class ArrayOutOfBounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter the no of elements: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("enter the index value: ");
			int a = sc.nextInt();
			System.out.println(arr[a]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out Of Bound exception has been occured!");
			System.out.println("enter a valid index value!");
		}
		
	}
		

}
