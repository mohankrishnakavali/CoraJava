package practice.indiabix;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("two");
		ts.add("five");
		
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ,");
		}
				
	}

}
