package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample5 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "mohan");
		map.put(2, "krishna");
		map.put(5, "mohan");
		
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()){
			Integer key=it.next();
			String value=map.get(key);
			//System.out.println(key +" -- "+value);
		}
		
		Iterator<String> it1=map.values().iterator();
		while(it1.hasNext()){
			String value=it1.next();
			System.out.println(value);
		}
	}
}
