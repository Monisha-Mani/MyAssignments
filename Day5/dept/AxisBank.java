package org.dept;

public class AxisBank extends Bank{
	public void deposit() {
		System.out.println("called method deposit from AxisBank");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.fixed();
		obj.savings();
		obj.deposit();//over ridden
		
		Bank obj2=new Bank();
		obj2.deposit();
	}
}
