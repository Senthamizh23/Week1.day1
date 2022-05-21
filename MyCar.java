package week1.day1;

public class MyCar {
	
	Car mycarobj = new Car();
	
	public void callCar()
	{
		mycarobj.StartEngine();
		mycarobj.applyGear();
		mycarobj.switchonHeadlight();
		mycarobj.applyAccelerate();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar mycarobj1 = new MyCar();
		mycarobj1.callCar();
		
	}

}
