package com.musings.di.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.musings.di.BeanA;
import com.musings.di.BeanB;
import com.musings.di.BeanC;
import com.musings.di.BeanD;

public class Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml")) {
			BeanA beanA = applicationContext.getBean("beanA", BeanA.class);
			BeanA beanAAA = applicationContext.getBean("beanA", BeanA.class);
			BeanA bean1 = applicationContext.getBean("_bean1", BeanA.class);
			
			BeanA beanAA = applicationContext.getBean("beanAA", BeanA.class);
			System.out.println("beanA == beanAA : " + (beanA == beanAA));
			System.out.println("beanA == beanAAA : " + (beanA == beanAAA));
			System.out.println("bean1 == beanAAA : " + (bean1 == beanAAA));
			
			
			BeanB beanB = applicationContext.getBean("beanB", BeanB.class);
			beanB.execute();
			
			BeanB beanBInt = applicationContext.getBean("beanBInt", BeanB.class);
			beanBInt.execute();
			
			BeanB beanBString = applicationContext.getBean("beanBString", BeanB.class);
			beanBString.execute();
			
			BeanC beanC = applicationContext.getBean("beanC", BeanC.class);
			beanC.getBeanB().execute();
			
			BeanD beanD = applicationContext.getBean("beanD", BeanD.class);
			beanD.getYear();
			
			BeanD beanDD = applicationContext.getBean("beanDD", BeanD.class);
			beanDD.getYear();
		}
	}

}
