package com.musings.di;

import java.util.Calendar;

public class BeanD {

	Calendar calendar;

	public BeanD(Calendar calendar) {
		System.out.println("Instantiating the Bean D");
		this.calendar = calendar;
	}

	public void getYear() {
		System.out.println(calendar.get(Calendar.YEAR));
	}

}
