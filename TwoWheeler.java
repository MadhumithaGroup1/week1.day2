package week1.day2;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 9876659560l;
	boolean isPunctured = false;
	String bikeName = "Pulsar";
	double runningKM = 12345.876543;
	
	public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
		
		System.out.println("No. of wheels = "+obj.noOfWheels);
		System.out.println("No. of mirrors = "+obj.noOfMirrors);
		System.out.println("Chassis Number = "+obj.chassisNumber);
		System.out.println("Bike is puctured = "+obj.isPunctured);
		System.out.println("Bike Name = "+obj.bikeName);
		System.out.println("Running KM = "+obj.runningKM);
	}


}
