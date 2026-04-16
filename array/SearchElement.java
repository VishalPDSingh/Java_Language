package array;

public class SearchElement {
	static int searchIndex(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 52, 69, 7, 45, 12 };
		int n = 12;
		int res = searchIndex(arr, n);
		System.out.println(res);
	}
}
