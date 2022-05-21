package week1.day1;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,11,10,15,18,17,18,16,17,19,18,17,20};
		int length = arr.length;
		int count;
		for(int i=0; i<length-1; i++)
		{
			count = 0;
			for(int j=i+1; j<length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(arr[i]);
	}
		}
	}
}
