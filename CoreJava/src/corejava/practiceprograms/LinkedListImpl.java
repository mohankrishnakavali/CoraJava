package corejava.practiceprograms;


class Node{
	protected int data;
	protected Node link;
	
	public Node(){
		link=null;
		data=0;
	}
	public Node(int d, Node n){
		data =d;
		link=n;
	}
	
	public void setLink(Node n){
		link=n;
	}
	public void setData(int n){
		data=n;
	}
	
	public int getLink(){
		return data;
	}
	public Node getData(){
		return link;
	}
}

public class LinkedListImpl {
	protected Node start;
	protected Node end;
	protected int size;
	
	public LinkedListImpl(){
		start=null;
		end =null;
		size=0;
	}
	
	public boolean isEmpty(){
		return start==null;
	}
	
	public void insertAtStart(int val){
		Node node=new Node(val, null);
		size++;
		if(start==null){
			start=node;
			end=start;
		}else{
			node.setLink(start);
			start=node;
		}
	}
	public void insertAtEnd(int val){
		Node node=new Node(val, null);
		size++;
		if(start==null){
			start=node;
			end=start;
		}else{
			end.setLink(node);
		}
	}
	
}
