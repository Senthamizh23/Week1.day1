package week1.day1;

public class Calculator {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	 }
	public int sub(int a, int b) {
		int c = a-b;
		return c;
	 }
	public double mul(double a, double b) {
		double c = a*b;
		return c;
	 }
	public float div(float a, float b) {
		float c = a/b;
		return c;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		 int add = calc.add(8,2);
		 int sub = calc.sub(3,2);
		 double mul = calc.mul(13, 2);
		 float div = calc.div(6f, 2f);
		 System.out.println(add);
		 System.out.println(sub);
		 System.out.println(mul);
		 System.out.println(div);
	}

}
