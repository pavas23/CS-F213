public class q3{
	public static void main(String[] args){
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.append(1);
		dl.append(2);
		dl.printList();
		dl.append(3);
		dl.printList();
		try{
			dl.insert(4,3);
			dl.printList();
			dl.insert(5,1);
			dl.printList();
            dl.insert(7, -1);
            dl.insert(10, 100);
		}
		catch(IndexLessThanZeroException il){
			System.out.println("***" + il + "***");
		}
	}
}

// user defined exception which extends Exception class
class IndexLessThanZeroException extends Exception{
	public String toString(){
		String s = "Node can't be inserted at index less than zero!!";
		return s;
	}
}

class Node{
	int val;
	Node prev;
	Node next;
	Node(){
		val = 0;
		prev = null;
		next = null;
	}
	Node(int val){
		this.val = val;
		prev = null;
		next = null;
	}
}

class DoublyLinkedList{
	Node head;
	Node tail;
	DoublyLinkedList(){
		head = null;
		tail = null;
	}
	void append(int val){
		Node newNode = new Node(val);
		if(head == null){
			head = newNode;
			tail = newNode;
			return;
		}
		// tail is a pointer pointing to the last node of the dobuly linked list.
		tail.next = newNode;
		newNode.prev = tail;
		newNode.next = null;
		tail = newNode; 
	}
	int size(){
		int size = 0;
		Node ptr = head;
		if(ptr == null){return size;}
		size = 1;
		while(ptr != tail){
			ptr = ptr.next;
			size++; 
		}
		return size;
	}
	void insert(int val, int index) throws IndexLessThanZeroException{
		Node newNode = new Node(val);
		if(index < 0){
			throw new IndexLessThanZeroException();
		}
		if(head == null){
			if(index > 0){
				System.out.println("Node can't be inserted at index" + index);
				return;
			}
			else{
				head = newNode;
				tail = newNode;
				return;
			}
		}
		else if(index<this.size()){
			Node ptr = head;
			for(int count = 0; count < index-1; count++){
				ptr = ptr.next;
			}
			Node nextNode = ptr.next;
			newNode.next  = nextNode;
			nextNode.prev = newNode;
			newNode.prev = ptr;
			ptr.next = newNode;
		}
		else if(index == this.size()){
			this.append(val);
		}
        else if(index > this.size()){
            System.out.println("The node can't be inserted at this index"+index);
        }
	}
	void printList(){
		if(head == null){
			System.out.println("The doubly linked list is empty");
		}
		Node ptr = head;
		while(ptr != tail){
			System.out.print(ptr.val + "-->");
			ptr = ptr.next;
		}
		System.out.println(ptr.val);
	}	
}

