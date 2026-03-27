package ch_Array;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<=n-1; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(a.length); // length of array
		// own value
		int [] a1 = {1,5,6,8,9,8};
		System.out.println(a1); // print the address of stack
		sc.close();
	}
}
