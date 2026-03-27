package ch_Array;

public class SwapToElem {
	static void swap(int a[])
	{
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	public static void main(String[] args) {
		
		int a[] = {60,25};
		
		swap(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}
