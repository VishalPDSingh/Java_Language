package ch_Array;

import java.util.Scanner;

public class ReverseArrayElements {
	static void reverse(int a[]) {
        int sp = 0;
        int ep = a.length - 1;

        while (sp < ep) {
            int temp = a[sp];
            a[sp] = a[ep];
            a[ep] = temp;

            sp++;
            ep--;
        }
    }
	public static void main(String[] args) {
		 System.out.println("Enter the value of n: ");
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        // Input
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Original array
	        System.out.println("Original Array:");
	        for (int a : arr) {
	            System.out.print(a + " ");
	        }

	        System.out.println();

	        // Reverse
	        reverse(arr);

	        // Reversed array
	        System.out.println("Reversed Array:");
	        for (int a1 : arr) {
	            System.out.print(a1 + " ");
	        }

	        sc.close();
	}
}
