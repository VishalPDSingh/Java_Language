package ch2_DataTypes;

import java.util.Scanner;

public class SwapTwoVariable {
	public static void main(String[] args) {
		
		System.out.println("Enter the value of a and b");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b =  sc.nextInt();
		// incorrect way
//		a = b;
//		b = a;
//		System.out.println(a);
//		System.out.println(b);
		
		// correct way
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
	}
}
