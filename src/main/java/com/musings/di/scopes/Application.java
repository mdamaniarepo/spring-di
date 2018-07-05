package com.musings.di.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
			Singleton singleton = context.getBean("singleton", Singleton.class);
			Prototype prototype1 = singleton.createPrototypeBean();
			Prototype prototype2 = singleton.createPrototypeBean();
			System.out.println((prototype1 == prototype2) ? "same instances" : "different instances");

			ApplicationContextAwareTest applicationContextAwareTest = context.getBean("applicationContextAwareTest",
					ApplicationContextAwareTest.class);
			prototype1 = applicationContextAwareTest.createPrototypeBean();
			prototype2 = applicationContextAwareTest.createPrototypeBean();
			System.out.println((prototype1 == prototype2) ? "same instances" : "different instances");
			
			MethodInjectionTest methodInjectionTest = context.getBean("methodInjectionTest",
					MethodInjectionTest.class);
			prototype1 = methodInjectionTest.createPrototypeBean();
			prototype2 = methodInjectionTest.createPrototypeBean();
			System.out.println((prototype1 == prototype2) ? "same instances" : "different instances");
		}
	}

}
