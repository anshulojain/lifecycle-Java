package edu.neu.csye6200.api;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MidTerm {

	public static List<Integer> dataList = new ArrayList<Integer>();
	public static List<Double> datadouble = new ArrayList<Double>();
	
	static {
		dataList.add(1);
		dataList.add(2);
		dataList.add(3);
		datadouble.add(1.1);
		datadouble.add(2.1);
		datadouble.add(3.1);
	}
	
	
	public static void demo() {
		MidTerm m = new MidTerm();
		m.transformIntData();
		m.showIntData();
		dataList.set(0, 1);
		dataList.set(1, 2);
		dataList.set(2, 3);
		m.listIteratorTransformIntData1();
		m.showIntData();
		m.listIteratorTransformIntData2();
	}
	
	public void showIntData() {
		for (Integer d : dataList) {
			System.out.println(d);
		}
	}
	
	public void transformIntData(){
		int  i = 0;
		for (Integer d : dataList) {
			d = (d+1) * 2;
			dataList.set(i, d);
			i++;
		}
	}
	
	public void listIteratorTransformIntData1(){
		ListIterator<Integer> l = dataList.listIterator();
		while(l.hasNext()) {
			int result = l.next();
			l.set((result + 1) * 2);
		}
	}
	
	public void listIteratorTransformIntData2(){
		ListIterator<Double> l = datadouble.listIterator();
		while(l.hasNext()) {
			double res = l.next();
			res = (res + 1)*2;
			System.out.println(res);
		}
	}
	
}

