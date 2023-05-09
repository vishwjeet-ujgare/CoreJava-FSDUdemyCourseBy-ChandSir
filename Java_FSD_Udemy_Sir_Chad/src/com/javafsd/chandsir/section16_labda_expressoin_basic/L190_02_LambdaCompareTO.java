package com.javafsd.chandsir.section16_labda_expressoin_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data1 {
	private String name;

	public Data1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class L190_02_LambdaCompareTO {

	public static void main(String args[]) {
		List<Data1> list = new ArrayList<>();
		list.add(new Data1("Vishwjeet"));
		list.add(new Data1("Abhi"));
		list.add(new Data1("Poorva"));
		list.add(new Data1("Shree"));
		list.add(new Data1("ED"));

		// To demonstrate single lambda expressions
		Collections.sort(list,(Data1 o1,Data1 o2)->o1.getName().compareTo(o2.getName()));
		System.out.println("Sort by name : ");
		displayList(list);
		
		/* demonstrates the use of lambda expression to perform some custom operations
		 and multiline lambda.
		*/
		Collections.sort(list, ((Data1 o1, Data1 o2) -> {
			if (o1.getName().length() < o2.getName().length()) {
				return -1;
			} else if (o1.getName().length() > o2.getName().length()) {
				return 1;
			} else {
				return 0;
			}
		}));
		
		System.out.println("------------------------------ ");
		System.out.println("Sort by length : ");
		displayList(list);
	}
	
	public static void displayList(List<Data1> list)
	{
		for (Data1 data : list) {
			System.out.println(data.getName());
		}
	}
}
