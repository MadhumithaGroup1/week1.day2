package week1.day2;

public class EmployeeDetails {
	
	public void printEmployeeName(String empName, int empId) {
		System.out.println("Name: "+empName+"	Id:"+empId);
	}
	
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address: "+empAddress);
	}
	
	public void printEmployeeSalary(double empSalary)
	{
		System.out.println("Salary: "+empSalary+"/m");
	}
	
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile Number: "+mobNum);
	}
	
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		System.out.println("Employee Details");
		obj.printEmployeeName("Madhumitha", 654);
		obj.getEmployeeAddress("Chennai");
		obj.printEmployeeSalary(35000);
		obj.printEmployeeMobileNumber(7869034521L);
	}

}
