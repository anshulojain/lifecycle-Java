package edu.neu.csye6200.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student extends AbstractStudent implements Comparator{

	double gpa;
	
	@Override
	public double getGPA() {
		// TODO Auto-generated method stub
		return gpa;
	}

	@Override
	public void setGPA(double gpa) {
		// TODO Auto-generated method stub
		this.gpa = gpa;
	}
	Student(){}
	
	public void stuData(int id, String fname, String lname, int age){
		this.setId(id);
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setAge(age);
	}
	
	@Override
	public AbstractPerson parsePersonIDCSV(String personCSVLine) {
		String[] f = personCSVLine.split(",");
		double gpa = new Double(f[4]);
		int id = new Integer(f[0]);
		Student s1 = new Student();
		s1.setGPA(gpa);
		s1.setId(id);
		return s1;
	}
	
	public String toString() {
		return this.getId()+" "+this.getFirstName()+" "+this.getLastName()+" "+this.getAge()+" "+this.getGPA();
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return new Double (((Student)o1).getGPA()).compareTo(((Student)o2).getGPA());
	}
}
