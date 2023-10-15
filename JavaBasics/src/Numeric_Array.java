/*Ha Duy Bach 20210093*/

import java.util.Arrays;

public class Numeric_Array {
	public static void main(String[] args) {
		int[] a = new int[] {3,2,4,6,4,3,2,4,6};
		int sum = 0;
		
		Arrays.sort(a);
		
		for(int ai : a)
		{
			sum += ai;
		}
		
		System.out.print("Mảng đã sắp xếp: " + Arrays.toString(a));
		System.out.print("\nGiá trị trung bình :" + (double)sum/a.length);
 	}
}
