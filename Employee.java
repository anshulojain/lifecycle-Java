package edu.neu.csye6200.api;

public class Employee extends AbstractEmployee {

	double wage;
	
	@Override
	public double getWage() {
		// TODO Auto-generated method stub
		return wage;
	}

	@Override
	public void setWage(double wage) {
		// TODO Auto-generated method stub
		this.wage = wage;
	}
	
	public void empData(int id, String fname, String lname, int age){
		this.setId(id);
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setAge(age);
	}
	
	@Override
	public AbstractPerson parsePersonIDCSV(String personCSVLine) {
		String[] f = personCSVLine.split(",");
		double wage = new Double(f[5]);
		int id = new Integer(f[0]);
		Employee e1 = new Employee();
		e1.setWage(wage);
		e1.setId(id);
		return e1;
	}
	
	public String toString() {
		return this.getId()+" "+this.getFirstName()+" "+this.getLastName()+" "+this.getAge()+" "+this.getWage();
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return new Double (((Employee)o1).getWage()).compareTo(((Employee)o2).getWage());
	}

}
