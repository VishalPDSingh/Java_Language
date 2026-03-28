package ch_Array;

import java.util.Scanner;

public class ReverseArrayElePart {
	static void reversePart(int a[], int sp, int ep)
	{
		int s = sp;
		int e = ep;
		while(s < e)
		{
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("");
		
		reversePart(arr, start, end);
		for(int a1: arr)
			System.out.print(a1+" ");
		
		sc.close();
	}
}
