package edu.neu.csye6200.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LifeController extends AbstractLife {

	private static List<Person> pl = new ArrayList<>();
	private static List<Student> sl = new ArrayList<>();
	private static List<Employee> el = new ArrayList<>();
	private static List<String> dataList = new ArrayList<>();
	private static LifeController lcPerson = new LifeController();
	
	static {
		dataList.add("1,sam,jones,7,2.65,6.75,end");
		dataList.add("2,dan,smith,6,2.75,4.80,end");
		dataList.add("3,jim,adams,8,2.35,3.25,end");
		dataList.add("4,jan,lake,9,2.95,5.85,end");
		dataList.add("5,sam,jones,7,2.65,2.75,end");
		//System.out.println(dataList);
	}

	@Override
	public void loadPersons(List<String> personIDCSV) {
		for(String data : personIDCSV) {
			Person pTemp = new Person();
			pTemp = (Person)pTemp.parsePersonIDCSV(data);
			pl.add(pTemp);
		}
	}

	public static void demoPerson() {
		lcPerson.loadPersons(dataList);
		lcPerson.showPersons();
		lcPerson.sortPersonsByLastName();
		lcPerson.showPersons();
	}
	
	@Override
	public void loadStudents(List<String> personIDCSV) {
		// TODO Auto-generated method stub
		for(String data : personIDCSV) {
			Student sTemp = new Student();
			sTemp = (Student)sTemp.parsePersonIDCSV(data);
			for(Person p : pl) {
				if(sTemp.getId() == p.getId()) {
					sTemp.stuData(p.getId(), p.getFirstName(), p.getLastName(), p.getAge());
				}
			}
			sl.add(sTemp);
		}
	}

	public static void demoStu() {
		lcPerson.agePersons(1, 10);
		lcPerson.loadStudents(dataList);
		lcPerson.showStudents();
		lcPerson.scaleStudentsGPA(1, 1);
		lcPerson.showStudents();
		lcPerson.sortStudentsByGPA();
		lcPerson.showStudents();
	}
	
	@Override
	public void loadEmployees(List<String> personIDCSV) {
		// TODO Auto-generated method stub
		for(String data : personIDCSV) {
			Employee eTemp = new Employee();
			eTemp = (Employee)eTemp.parsePersonIDCSV(data);
			for(Student s : sl) {
				if(eTemp.getId() == s.getId()) {
					eTemp.empData(s.getId(), s.getFirstName(), s.getLastName(), s.getAge());
				}
			}
			el.add(eTemp);
		}
	}

	public static void demoEmp() {
		lcPerson.agePersons(1, 10);
		for(Student s : sl) {
			s.setAge(s.getAge() + 10);
		}
		lcPerson.loadEmployees(dataList);
		lcPerson.showEmployees();
		lcPerson.scaleEmployeeWages(1, 10);
		lcPerson.showEmployees();
		lcPerson.sortEmployeesByWage();
		lcPerson.showEmployees();
	}
	
	@Override
	public void agePersons(int offset, int scale) {
		// TODO Auto-generated method stub
		for(Person p : pl) {
			p.setAge(p.getAge() + (offset * scale));
		}
	}

	@Override
	public void scaleStudentsGPA(double offset, double scale) {
		// TODO Auto-generated method stub
		for(Student s : sl) {
			s.setGPA(s.getGPA() + (offset * scale));
		}
	}

	@Override
	public void scaleEmployeeWages(double offset, double scale) {
		// TODO Auto-generated method stub
		for(Employee e : el) {
			e.setWage(e.getWage() + (offset * scale));
		}
	}

	@Override
	public void showPersons() {
		// TODO Auto-generated method stub
		System.out.println("--------Person--------");
		for(Person p : pl) {
			System.out.println(p);
		}
	}

	@Override
	public void showStudents() {
		// TODO Auto-generated method stub
		System.out.println("--------Students--------");
		for(Student p : sl) {
			System.out.println(p);
		}
	}

	@Override
	public void showEmployees() {
		// TODO Auto-generated method stub
		System.out.println("--------Employee--------");
		for(Employee p : el) {
			System.out.println(p);
		}
	}

	@Override
	public void sortPersonsByLastName() {
		// TODO Auto-generated method stub
		Collections.sort(pl, new Person());
	}

	@Override
	public void sortStudentsByGPA() {
		// TODO Auto-generated method stub
		Collections.sort(sl, new Student());
	}

	@Override
	public void sortEmployeesByWage() {
		// TODO Auto-generated method stub
		Collections.sort(el, new Employee());
	}

}
