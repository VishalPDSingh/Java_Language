
package array;

public class ArrayReturn {
	static int[] returnType(int arr[]) {
		int b[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			b[i] = arr[i];
		}
		return b;
	}

	public static void main(String[] args) {

		int arr[] = { 0, 20 };
		System.out.println(arr[0] + " " + arr[1]);

		int res[] = returnType(arr);

		for (int i = 0; i < res.length; i++)
			System.out.println(res[0] + " " + res[1]);
	}
}
