package ch_Array;

import java.util.Scanner;

public class IndexSwap {
	static void swap(int a[], int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void main(String[] args) {

		System.out.println("Enter the value of n: ");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the value of index to swap: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt(); 

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int arr : a)
			System.out.print(arr+" ");
		swap(a, x, y);
		System.out.println();
		for (int arr1 : a)
			System.out.print(arr1+" ");
		scanner.close();
	}
}
