package com.ava.Generics;

import java.util.Date;
import java.util.ArrayList;

public class TestAndDebugForTextbook {

	public static void main(String[] args) {
		//ArrayList<E> dates = new Arraylist(); --> E should be defined clearly
		ArrayList<Object> dates = new ArrayList();
		//Date()should be invoked from java.util.Date without parameter; rather than java.sql.Date;
		dates.add(new Date());
		dates.add(new String());
		System.out.println("Mixed List: " + dates);
		
		ArrayList<Date> dates1 = new ArrayList<>();
		dates1.add(new Date());
		//dates.add(new String());
		System.out.println("List2: " + dates1);
		
		//ArrayList dates = new ArrayList();
		ArrayList<Date> dates2 = new ArrayList<>();
		dates2.add(new Date());
		Date date = dates2.get(0);
		System.out.println("List3: " + dates2);
		
		ArrayList<Date> dates3 = new ArrayList<>();
		dates3.add(new Date());
		Date date2 = dates3.get(0);
		System.out.println("List4: " + dates3);
}

}
