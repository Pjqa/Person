package com.qa.main;

public class Runner {

	public static void main(String[] args) {
	
	Person ps = new Person ();
	
	System.out.println(ps.toString());
	
	Person ps1 = new Person ("Thing1", 21, "The Cat in the Hat Assistant");
	System.out.println(ps1.toString());
	
	Person ps2 = new Person ("Thing2", 21, "The Cat in the Hat 2nd Assistant");
	System.out.println(ps2.toString());
	
	InfoList il = new InfoList();
	il.Per.add(ps1);
	il.Per.add(ps2);
		System.out.println(il.Per);
    
		System.out.println(il.findName("Thing2"));
		System.out.println(il.findName("Thing3"));
	}
}
