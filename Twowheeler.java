package week1.day1;

public class Twowheeler {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=80724001;
	boolean isPunctured=false;
	String bikeName="YamahaFZ1";
	double runningKM=23.9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Twowheeler obj=new Twowheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);
	}

}
