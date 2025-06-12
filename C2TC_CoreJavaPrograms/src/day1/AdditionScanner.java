package day1;
import java.util.Scanner;

public class AdditionScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter number a : ");
		a = sc.nextInt();
		System.out.print("Enter number b : ");
		b = sc.nextInt();	
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
		sc.close();
	}
}
