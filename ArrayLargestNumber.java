package week1.day1;

import java.util.Arrays;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {1,4,12,4,6,7};
		  Arrays.sort(data);
		  int length = data.length;
		  System.out.println(data[length-2]);
	}

}
