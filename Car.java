package week1.day2;

public class Car {
	
	public void applyBreak() {
		System.out.println("Break applied");
	}
	
	public void applyGear() {
		System.out.println("Gear applied");
	}
	
	public void switchOnAc() {
		System.out.println("AC switched ON");
	}
	
	public void applyAccelerator() {
		System.out.println("Accelerator applied");
	}
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAccelerator();
	}

}
