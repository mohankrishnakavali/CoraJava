package practice.indiabix;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExmp {
	public static void main(String[] args) {
		System.out.println("Entered in Main method");
		HashSet<String> set =new HashSet<String>();
		System.out.println("2");
		set.add("one");
		System.out.println("Entered in Main method");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("one");
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			System.out.print(it.hasNext() + " ");
		}
	}
}
