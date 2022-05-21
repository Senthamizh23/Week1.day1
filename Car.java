package week1.day1;

public class Car {
	
public void StartEngine() {
		
		System.out.println("Engine Started");
	}
	
    public void applyGear() {
		
		System.out.println("Gear Applied");
	}
    
    public void switchonHeadlight() {
		
		System.out.println("Headlight Switched On");
	}
    
    public void applyAccelerate() {
		
		System.out.println("Acceleration Applied");
	}
    
   public static void main(String[] args) {
	   
	   System.out.println("Car Class");
	   
	   Car c = new Car();
	   c.StartEngine();
	   c.applyGear();
	   c.switchonHeadlight();
	   c.applyAccelerate();
   }


}


