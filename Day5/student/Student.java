package org.student;

import org.dept.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("called method studentName");
	}
	public void studentDept() {
		System.out.println("called method studentDept");
	}
	public void studentID() {
		System.out.println("called method studentID");
	}
	public void getStudentInfo(int id) {
		System.out.println("called method studentInfo with one argument");
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("called method studentInfo with ID and Name");
	}
	public void getStudentInfo(String email,int phNo) {
		System.out.println("called method studentInfo with Email and PhoneNo");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentID();
		obj.getStudentInfo(165887);
		obj.getStudentInfo(165887,"Monisha");
		obj.getStudentInfo("monishamkt@gmail.com",012345);
	}
}
