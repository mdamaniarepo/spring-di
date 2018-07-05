package com.musings.di.scopes;

public class Singleton {
	
	private Prototype prototypeBean;
	
	public Prototype createPrototypeBean() {
		return prototypeBean;
	}

	public void setPrototypeBean(Prototype prototypeBean) {
		this.prototypeBean = prototypeBean;
	}
	
}
