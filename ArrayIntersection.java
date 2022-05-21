package week1.day1;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,8,4,6,7};
		int[] arr1={1,2,8,4,11,9};
		int length=arr.length;
		int len=arr1.length;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(arr[i]==arr1[j])
					System.out.println(arr[i]);
	}

}
}
}
