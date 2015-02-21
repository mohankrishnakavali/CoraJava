package com.Intuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
	public List<Employee_Set> employeeList() {
		Map<String,String> map=new HashMap<String,String>();
		Employee_Set emp = new Employee_Set();
		emp.setAge(26);
		emp.setName("mohank");
		Employee_Set emp1 = new Employee_Set();
		emp1.setAge(30);
		emp1.setName("mohan");
		Employee_Set emp2 = new Employee_Set();
		emp2.setAge(28);
		emp2.setName("mohan");
		Employee_Set emp3 = new Employee_Set();
		emp3.setAge(31);
		emp3.setName("munimohan");
		Employee_Set emp4 = new Employee_Set();
		emp4.setAge(30);
		emp4.setName("devaraj");
		Employee_Set emp5 = new Employee_Set();
		emp5.setAge(31);
		emp5.setName("mohan");
		Employee_Set emp6 = new Employee_Set();
		emp6.setAge(22);
		emp6.setName("munisekhar");
		List<Employee_Set> empList = new ArrayList<Employee_Set>();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);

		return empList;
	}
	

}