package dataStructures;

public class LinkedLists {
	LinkedLists next;
	int data;
	public LinkedLists(int data){
		this.data = data;
	}
	
	public void append(int data){
		LinkedLists current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = new LinkedLists(data);
	}
	
	public static void main(String[] args) {
		LinkedLists ll = new LinkedLists(0);
	}
}
