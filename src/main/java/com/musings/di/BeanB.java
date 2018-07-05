package com.musings.di;

public class BeanB {
	
	
	public BeanB(String value) {
		System.out.println("Invoking String constructor: "+ value);
	}
	
	public BeanB(Integer value) {
		System.out.println("Invoking Integer constructor: "+ value);
	}
	
	public BeanB(String fName, String lName) {
		System.out.println("Invoking String, String constructor: "+ fName + ", : " + lName);
	}
	
	public void execute() {
		System.out.println("Executing Bean B");
	}

}
