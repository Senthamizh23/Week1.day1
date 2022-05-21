package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 371;
		
		int  sum = 0;
		int output = input;
		while(input > 0)
		{
			int rem = input % 10;
			rem = rem * rem * rem ;
			sum = sum + rem;
			input = input / 10;
	}

		System.out.println(sum);
		if (sum == output)
		{
			System.out.println("Given no is Armstrongnumber");
		}
		else
		{
			System.out.println("No is not a armstrong no");
}
}
}
