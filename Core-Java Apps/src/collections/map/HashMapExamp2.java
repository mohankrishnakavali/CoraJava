package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamp2 {
	public static void main(String[] args) {
		Map<String, String> studentGrades=new HashMap<String, String>();
		studentGrades.put("mohan", "C");
		studentGrades.put("munimohan","A++");
		studentGrades.put("Munisekhar","b");
		
		//System.out.println("Mohan grade : "+studentGrades.get("mohan"));
//		studentGrades.remove("mohan");
		
		for(String key: studentGrades.keySet()){
			System.out.println(key + "---"+studentGrades.get(key));
		}
	}
}
