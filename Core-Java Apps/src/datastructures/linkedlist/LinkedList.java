package datastructures.linkedlist;

public class LinkedList {
	protected Node start;
	protected Node end;
	public int size;
	
	public LinkedList(){
		start=null;
		end=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return start==null;
	}
	public int getSize(){
		return size;
	}
	public void insertAtStart(int val){
		Node node=new Node(val, null);
		size++;
		if(start==null){
			start=node;
			end=start;
		}else{
			end.setLink(node);
			end=node;
		}
	}
	public void insertAtPosition(int value, int position){
		Node node=new Node(value, null);
		Node ntr=start;
		position=position-1;
	}
}
