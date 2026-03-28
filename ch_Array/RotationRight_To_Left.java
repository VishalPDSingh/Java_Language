package ch_Array;

public class RotationRight_To_Left {
	static void rotation(int a[], int sp, int ep) {

		while (sp < ep) {
			int temp = a[sp];
			a[sp] = a[ep];
			a[ep] = temp;
			sp++;
			ep--;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, -2, 1, 4, 6, 9, 8 };
		int sp = 0;
		int ep = arr.length - 1;
		int k = 100 % arr.length;
		System.out.println(k);
		System.out.println("1st Reverse of array");
		rotation(arr, sp, ep);
		for (int a1 : arr)
			System.out.print(a1 + " ");
		System.out.println("----------------");
		System.out.println("K revese array: ");
		rotation(arr, sp, k - 1);
		for (int a2 : arr)
			System.out.print(a2 + " ");
		System.out.println("------------------");
		System.out.println("after kth elemets: ");
		rotation(arr, k, ep);
		for (int a3 : arr)
			System.out.print(a3 + " ");

	}
}
