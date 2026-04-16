package array;

public class Q2_ArraySubSet {
	static boolean isSubset(int a[], int b[]) {
		for (int i = 0; i < b.length; i++) {
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					found = true;
					break;
				}
			}
			if (!found)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		int a[] = { 1,2,2};
		int b[] = { 1,1 };
		boolean res = isSubset(a, b);
		System.out.println(res);
	}
}
