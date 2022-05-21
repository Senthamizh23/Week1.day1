package week1.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,4,5,7,9};
		int length=arr.length;

		Arrays.sort(arr);
		for(int i=1;i<length;i++)
		{
				if(i!=arr[i-1])
				{

					System.out.println(i);
					break;	
	}

}
}
}