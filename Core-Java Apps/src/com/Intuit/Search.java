package com.Intuit;

import java.util.Iterator;
import java.util.List;

public class Search {
	//public String nameSearch(String name){
	public static void main(String[] args){
		Employee emp=new Employee();
		List<Employee_Set> empList=emp.employeeList();
		Iterator<Employee_Set> itr=empList.listIterator();
		while(itr.hasNext()){
			Object obj=itr.next();
			String name=obj.getClass().getName();
			System.out.println("Object name is : "+name);
		}
		//return name;
	}
}
