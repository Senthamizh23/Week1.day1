package week1.day1;

public class FibonnaciSeries {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int a=0,b=2,c,num=5;
			System.out.print(a+" "+b);
			for(int i=0;i<num-2;i++)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;

	}

}
}