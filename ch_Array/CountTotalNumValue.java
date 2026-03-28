package ch_Array;
// Given N array elements count total num of elements have atleast 1
// elements greater then itself;






public class CountTotalNumValue {
	static int countGreater(int a[])
	{
		int n = a.length;
		// maximum of elements
		int maxValue = Integer.MIN_VALUE;
		int maxCount = 0;
		for(int i=0; i<n; i++)
		{
			if(a[i]>maxValue)
			{
				maxValue = a[i];
			}
		}
		for(int i=0; i<n; i++)
		{
			if(a[i] == maxValue)
				maxCount++;
		}
		return n-maxCount;
	}
	public static void main(String[] args) {
		
		int arr[] = {3,4,11,8,2,10,9,11};
		
		int res = countGreater(arr);
		System.out.println(res);
	}
}
