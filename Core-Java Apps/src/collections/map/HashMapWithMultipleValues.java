package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapWithMultipleValues {
	public static void main(String[] args) {
		Map<String, List<String>> map=new HashMap<String, List<String>>();
		
		List<String> list1=new ArrayList<String>();
		list1.add("mohan");
		list1.add("krishna");
		list1.add("deepu");
		List<String> list2=new ArrayList<String>();
		list2.add("mohan1");
		list2.add("krishna1");
		list2.add("deepu1");
		List<String> list3=new ArrayList<String>();
		list3.add("mohan");
		list3.add("krishna");
		list3.add("deepu");
		List<String> list4=new ArrayList<String>();
		list4.add("mohan");
		list4.add("krishna");
		list4.add("deepu");
		
		map.put("A", list1);
		map.put("B", list2);
		map.put("C", list3);
		map.put("D", list4);
		
		System.out.println("Fetching Keys and Corresponding values");
		for(Map.Entry<String, List<String>> entry : map.entrySet()){
			String key=entry.getKey();
			List<String> list=entry.getValue();
			
			System.out.println(key +" ---- " +list);
		}
		
	}
}
