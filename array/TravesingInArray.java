package array;

public class TravesingInArray {
	public static void main(String[] args) {

		int arr[];
		int n = 5;
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println(arr); // hashcode
		System.out.println(arr.toString());
	}
}
