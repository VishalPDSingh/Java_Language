package ch_Array;

import java.util.Scanner;

public class SumOfEle {
	public static void main(String[] args) {
		
		System.out.println("Enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int sum = 0;
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = scanner.nextInt();
			sum = sum+a[i];
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Elements of array "+a[i]);
		}
		System.out.println("Sum is "+sum);
		scanner.close();
	}
}
