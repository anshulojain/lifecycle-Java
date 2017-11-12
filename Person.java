package edu.neu.csye6200.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person extends AbstractPerson implements Comparator{

	private int age;
	private String firstName;
	private String lastName;
	private int id;
	
	Person(){}
	Person(int id, String fname, String lname, int age){
		this.setId(id);
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setAge(age);
	}
	
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}

	@Override
	public AbstractPerson agePerson(int offset, int scale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

	@Override
	public LocalDate getDob() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDob(LocalDate dob) {
		// TODO Auto-generated method stub

	}

	@Override
	public Gender getGender() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGender(Gender gender) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public AbstractPerson parsePersonIDCSV(String personCSVLine) {
		// TODO Auto-generated method stub
		List<String> parseList = new ArrayList<>();
		String[] f = personCSVLine.split(",");
		int id = new Integer(f[0]);
		String fname = f[1];
		String lname = f[2];
		int age = new Integer(f[3]);
		double gpa = new Double(f[4]);
		double wage = new Double(f[5]);
		Person p1 = new Person(id, fname, lname, age);
		return p1;
	}
	
	public String toString(){
		return this.getId()+" "+this.getFirstName()+" "+this.getLastName()+" "+this.getAge();
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return new String (((Person) o1).getLastName()).compareTo(((Person) o2).getLastName());
	}

}
