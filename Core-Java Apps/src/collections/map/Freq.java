package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Freq {
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		
		for(String a: args){
			Integer freq=map.get(a);
			map.put(a, (freq==null)?1: freq+1);
		}
		System.out.println(map.size() + " distinct words");
		System.out.println(map);
		
	}
}
