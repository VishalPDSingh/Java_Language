package array;

public class Q1_LargestInArray {
	static int largestNum(int arr[]) {
		int maxNum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 52, 63, 89, 74 };
		int res = largestNum(arr);
		System.out.println(res);
	}
}
