package com.cg.oct12.batch3.day7;

import java.util.ArrayList;

public class CalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr[4]);

		ArrayList myList = new ArrayList();

		App obj = new App();

		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		myList.add(new App());
		myList.add(obj);

		System.out.println(myList);

		System.out.println(myList.get(2));


	}

}
