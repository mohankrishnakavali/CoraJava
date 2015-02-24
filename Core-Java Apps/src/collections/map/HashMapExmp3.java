package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmp3 {
	public static void main(String[] args) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(new Integer(2), 2);
		map.put(new Integer(3), 3);
		map.put(new Integer(4), 4);
		map.put(new Integer(5), 5);
		map.put(new Integer(6), 6);
		map.put(new Integer(7), 7);
		
		System.out.println(map);
		System.out.println();
		System.out.println("Enumerate the Hashmap");
		
		//Enumeration e = map.elements();
	}
}
