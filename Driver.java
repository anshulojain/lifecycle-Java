package edu.neu.csye6200.api;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MidTerm.demo();
		LifeController.demoPerson();
		LifeController.demoStu();
		LifeController.demoEmp();
	}
	
	
	
	///////OUTPUT/////////
	
	/*	
	 *  4								///MidTerm output
		6			
		8
		4
		6
		8
		4.2
		6.2
		8.2
		--------Person--------
		1 sam jones 7
		2 dan smith 6
		3 jim adams 8
		4 jan lake 9
		5 sam jones 7
		--------Person--------			///sorted Person
		3 jim adams 8
		1 sam jones 7
		5 sam jones 7
		4 jan lake 9
		2 dan smith 6
		--------Students--------		///students from aged Person
		1 sam jones 17 2.65
		2 dan smith 16 2.75
		3 jim adams 18 2.35
		4 jan lake 19 2.95
		5 sam jones 17 2.65
		--------Students--------		///gpa incremented
		1 sam jones 17 3.65
		2 dan smith 16 3.75
		3 jim adams 18 3.35
		4 jan lake 19 3.95
		5 sam jones 17 3.65
		--------Students--------		///sorted students
		3 jim adams 18 3.35
		1 sam jones 17 3.65
		5 sam jones 17 3.65
		2 dan smith 16 3.75
		4 jan lake 19 3.95
		--------Employee--------		///Employee from aged Student
		1 sam jones 27 6.75
		2 dan smith 26 4.8
		3 jim adams 28 3.25
		4 jan lake 29 5.85
		5 sam jones 27 2.75
		--------Employee--------		///wage incremented
		1 sam jones 27 16.75
		2 dan smith 26 14.8
		3 jim adams 28 13.25
		4 jan lake 29 15.85
		5 sam jones 27 12.75
		--------Employee--------		///sorted Employee
		5 sam jones 27 12.75
		3 jim adams 28 13.25
		2 dan smith 26 14.8
		4 jan lake 29 15.85
		1 sam jones 27 16.75
	 */
}


