package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExmp1 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("BMW", 50000);
		map.put("BENZ", 60000);
		map.put("Audi", 70000);
		map.put("ford", 30000);
		map.put(null, null);
		//System.out.println("Vehicles size: " + map.size());
		//System.out.println("Vehicle BMW is availble: " + map.containsKey("BMW"));
		
		// for iterating
		/*for(String key : map.keySet()){
			System.out.println(key + "- " +map.get(key));
			System.out.println();			
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter string to search : ");
		String nameToSearch=sc.next();
		
		if(map.containsKey(nameToSearch)){
			System.out.println("Price of "+nameToSearch+" - "+ map.get(nameToSearch) +" In cars!\n");
		}else{
			System.out.println(nameToSearch +"  car not found in car pool, please check the name in : "+ map.keySet());
		}
	}

}
