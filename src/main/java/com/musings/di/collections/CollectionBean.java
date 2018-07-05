package com.musings.di.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {

	private List<String> list;

	private Set<String> set;

	private Map<String, String> map;

	private Properties properties;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void logData() {
		System.out.println("Printing List");
		getList().forEach(System.out::println);
		
		System.out.println("Printing Set");
		getSet().forEach(System.out::println);
		
		System.out.println("Printing Map");
		getMap().forEach((k, v) -> System.out.println("key :" + k + ", Value: "+ v));
		
		System.out.println("Printing Properties");
		getProperties().forEach((k, v) -> System.out.println("key :" + k + ", Value: "+ v));
	}

}
