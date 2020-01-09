package org.model1;

public class Company extends reportCount {

	@Override
	public void Day() {
		System.out.println("day is started");
		
	}

	@Override
	public void month() {
		System.out.println("month name is june");
		
		
	}
	public static void main(String[] args) {
		Company c=new Company();
		c.month();
		c.Day();
		c.report();
	}
	
	
	

}
