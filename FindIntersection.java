package week1.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,5,15,7,3,6,9};
		int arr2[] = {2,6,8,5,9,12};
		int len1 = arr1.length;
		int len2 = arr2.length;
		for(int i =0; i< arr1.length; i++)
		{
			for(int j=0;j< arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
				}
	}
		}
	}
}
		

