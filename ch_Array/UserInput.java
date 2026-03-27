package ch_Array;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		// size of array
		int n = sc.nextInt();
		
		int []a =  new int[n];
		// taking value
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int x:a)
			System.out.println(x);
		
		sc.close();
	}
}
