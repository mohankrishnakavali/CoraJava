package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExamp4 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("krishna", new Double(350.33));
		map.put("krishna1", new Double(1350.33));
		map.put("krishna2", new Double(11350.33));
		map.put("krishna3", new Double(111350.33));
		map.put("krishna4", new Double(1111350.33));
		
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Map.Entry me=(Map.Entry)it.next();
			System.out.print(me.getKey()+"  : ");
			System.out.println(me.getValue());
		}
	}
}
