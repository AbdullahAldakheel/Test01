

public class Node {
	
	private Lab data;
	private Node next;
	public Node(Lab l) {
		this.data=l;
		this.next=null;
	}
	public void setData(Lab l) {  // Set Data
		this.data=l;
	}
	public Lab getData() {
		return data;
	}
	public void setNext(Node next) {
		this.next=next;
	}
	public Node getNext() {
		return next;
	}

}
