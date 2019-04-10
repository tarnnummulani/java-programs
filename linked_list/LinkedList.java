class LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	//Insertion of an element
	public void push(int new_data){
		Node new_node= new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	//printing linked list elements
	public void print(){
		Node tnode=head;
		while(tnode!=null){
		System.out.print(tnode.data+" "); 
        tnode = tnode.next;
		}
	}
	
	//Deletion of an elements
	public void delete(int key){
		Node temp=head;
		Node pre=null;
		if(temp!=null&&temp.data==key){
			head=temp.next;
			return;
		}
		while(temp!=null&&temp.data!=key){
			pre=temp;
			temp=temp.next;
		}
		if(temp==null){
			return;
		}
		pre.next=temp.next;
	}
	
	public static void main(String args[]){
		LinkedList l1 = new LinkedList();
		l1.push(2); 
		l1.push(5);
		l1.push(8);
		l1.push(7);
		l1.push(1);
		System.out.println("\nCreated Linked list is:");
		l1.print();
		l1.delete(5);
		System.out.println("\nLinked List after Deletion of element");
		l1.print();
	}
}