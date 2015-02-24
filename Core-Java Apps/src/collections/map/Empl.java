package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Empl {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setAge(29);
		emp.setName("munimohan");
		emp.setCompany("cts");
		Employee emp1=new Employee();
		emp.setAge(28);
		emp.setName("mohan");
		emp.setCompany("hcl");
		Employee emp2=new Employee();
		emp.setAge(23);
		emp.setName("munisekar");
		emp.setCompany("lara");
		Employee emp3=new Employee();
		emp.setAge(29);
		emp.setName("surendra");
		emp.setCompany("infosis");
		
		Map<Integer, Employee> empMap=new HashMap<Integer, Employee>();
		empMap.put(1, emp);
		empMap.put(2, emp1);
		empMap.put(3, emp2);
		empMap.put(4, emp3);

		for(Map.Entry<Integer, Employee> entry : empMap.entrySet()){
			Integer index=entry.getKey();
			Employee empValues=entry.getValue();
				String str=empValues.getName();
				System.out.println(str);
				Integer age=empValues.getAge();
				System.out.println(age);
				String str1=empValues.getCompany();
				System.out.println(str1);
			
			
		}
	}
}
