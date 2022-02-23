package DataStructure;

public class DList {

	
	private DListNode head;
	private DListNode tail;
	
	
	
	class DListNode{
	
		int data;
		DListNode next;
		DListNode prev;

		
		public DListNode (int data ) {
			
			this.data = data;
			this .next = null ;
			this.prev = null ;
			
			

		}
	}
	
	
	public void insertNodeHead (int data) {
		DListNode newNode = new DListNode(data);
	
		if (head == null ) {
			
			head = newNode;
			tail = newNode;
			
		}
		
		else {
			
			  newNode.next = head;
			  head.prev = newNode;
			head = newNode;
			
			
		}
				
	}
	
	public void print() {
		
		DListNode currNode = head;
		
		while(currNode != null) {
			System.out.print(currNode.data + " " + " ");
			
			currNode = currNode.next;
		}
		
		
		
		
	}
	
	
	public void delNodeTail() {
		tail.prev.next = null;
		tail = tail.prev;
		
		
		
	}
	
	public void delNodeFront() {
		head.next.prev = null;
		head = head.next;
		
	}
	
	
	
}
		
		
	
		
		
	



