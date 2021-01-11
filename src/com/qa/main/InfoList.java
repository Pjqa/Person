package com.qa.main;

import java.util.ArrayList;
import java.util.List;


public class InfoList {
	
	List<Person> Per = new ArrayList <>();
	
	public Person findName(String name) {
		for (Person p : Per){
				if (p.getName().equals(name)) {
					return p; 
				}
			} 
			System.out.println("Person Don't Exist");
			return null;
		}
}
