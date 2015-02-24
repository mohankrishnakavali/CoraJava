package collections.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExp1 {
	public static void main(String[] args) {
      Map<String, Integer> cars=new Hashtable<String, Integer>();
      cars.put("verna",5);
      cars.put("honda", 10);
    //  cars.put(null, 11);
      cars.put("hero", 15);
      cars.put("ford", 12);
      cars.put("bmw", 2);
      cars.put("scorpio", 35);
      cars.put("hero", 25);
      cars.put("hero", 25);
      
      //System.out.println(cars.size());
      
    /*  for(String key :cars.keySet()){
    	  System.out.println(key +" -- "+cars.get(key));
    	  System.out.println();
      }*/
      Scanner sc=new Scanner(System.in);
      System.out.print("Please Enter the car name : ");
      String name=sc.next();
      if(cars.containsKey(name)){
    	  System.out.println("Available  "+name +" cars in List : " +cars.get(name) );
      }else{
    	  System.out.println(name +" cars not available in list");
      }
	}
}
