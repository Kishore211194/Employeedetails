package org.emp;

public class Employee {
	public void empId() {
System.out.println("123");
	}
	
	public void empName() {
System.out.println("mani");
	}
	public void empDob() {
System.out.println("12/12/1998");
}
	public void empPhone() {
System.out.println("6323562653");
	}
	public void empEmail() {
System.out.println("mani@gmail.com");
	}
	public void empAddress() {
System.out.println("14,gandhi nagar,chennai");
	}
	
	public static void main(String[] args) {
		Employee c = new Employee();
		
		c.empId();
		c.empName();
		c.empDob();
		c.empPhone();
		c.empEmail();
		c.empAddress();
	}
}
