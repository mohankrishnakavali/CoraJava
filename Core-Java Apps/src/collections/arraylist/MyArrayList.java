package collections.arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList {

	private Object[] myStore;
	private int actsize = 0;

	public MyArrayList() {
		myStore = new Object[10];
	}

	public Object get(int index) {
		if (index < actsize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) {
		if (myStore.length - actsize <= 5) {
			increaseSizeList();
		}
		myStore[actsize++] = obj;
	}

	private void increaseSizeList() {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("\nNew Length : " + myStore.length);
	}

	public int size() {
		return actsize;
	}

	public static void main(String[] args) {
		MyArrayList mal=new MyArrayList();
		mal.add(1);
		mal.add(2);
		mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(6);mal.add(3);
		mal.add(4);
		mal.add(5);
		mal.add(6);
		mal.add(6);mal.add(6);mal.add(6);
		
		for(int i=0;i<mal.size();i++){
			System.out.println(mal.get(i));
			
		}
	}

}
