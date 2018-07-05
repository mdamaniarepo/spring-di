package com.musings.di.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml")) {
			CollectionBean collectionBean = applicationContext.getBean("simpleCollection", CollectionBean.class);
			collectionBean.logData();
		}
	}

}
