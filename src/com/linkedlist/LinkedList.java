package com.linkedlist;

public class LinkedList {
	
	public Node head = null;  
    public Node tail = null;  
	 static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	 public void pushNode(int data) {
		Node new_node= new Node(data);
		if(head==null) {
			head=new_node;
			tail=new_node;
		}
		else {
		tail.next=new_node;
		tail=new_node;
		}
	}
	 
	 
	 public void insertAtMiddle(int data,int pos) {
		 Node tmp1=new Node(data);
		 
		 if(pos==0) {
			 
			 tmp1.next=head;
			 head=tmp1;
		 }
		 else {
			 Node tmp=head;
			 for(int i=0;i<pos-2;i++) {
				 
				 tmp=tmp.next;
			 }
			 
			System.out.println(tmp.next);
			 tmp1.next=tmp.next;
			 tmp.next=tmp1;
			 
		 }
		
	}
	 public int size() {
		 Node tmp=head;
		 int size=0;
		 while(tmp!=null) {
			 tmp=tmp.next;
			 size++;
		 }
		 return size;
	 }
	 
	public void reverse() {
		for (int i=size()-1;i>=0;--i) {
			Node tmp=head;
            int e=i;
			while(e>0) {
				
				tmp=tmp.next;
				e--;
							}
			//System.out.println(tmp.data);
			pushNode(tmp.data);
						
			
		}
		
	}
	 
	 public void deleteNode(int no) {
		 
		 if(head.data==no) {
			 head=head.next;
		 }
		 else {
		 int c=0;
		 Node tmp=head;
		 try{
			 while(tmp.data!=no) {
			 tmp=tmp.next; // nth node
			 c++;
			
		 }
		 }
		 catch (NullPointerException e) {
			System.out.println("this element is not present in linked list");
		}
//		 if(c==0 && c<=6) {
//		 System.out.println("position of delete "+ c);
//		 }
		 if(c>=0 && c<size()) {
		 Node tmp1=head;
		 for(int i=0;i<c-1;i++) {
			 			 tmp1=tmp1.next; // n-1 th node
			 		 		 }
		 //Node tmp2=tmp.next; //n+1 th node
		 tmp1.next=tmp.next;
		 
		 }
	 }
	 }

	public void printNode() {
			Node tmp= head;
			while(tmp!=null) {
				System.out.println(tmp.data);
				tmp=tmp.next;
			}
		}
	 
	
	
	
public static void main(String[] args) {
	LinkedList llist= new LinkedList();
	//Node nd=new Node(5);
//	creating nodes
//	llist.head= new Node(5);
//	Node second= new Node(8);
//	Node third= new Node(18);
//	Node fourth= new Node(28);
//	Node fifth= new Node(38);
	
	llist.pushNode(55);
	llist.pushNode(54);
	llist.pushNode(53);
	llist.pushNode(51);
	llist.pushNode(52);
	llist.pushNode(3);
	llist.pushNode(1);
//	llist.pushNode(2);
	
	llist.printNode();
	
//    llist.head.next=second;
//    second.next=third;
//    third.next=fourth;
//    fourth.next=fifth;
    
//    System.out.println(fourth.data);  5  8 18  28  38
    
    Node fast=llist.head;
    Node slow=llist.head;
    while(fast.next!=null && fast!=null) {
    	//System.out.println(tmp2.data);

    	fast=fast.next.next;
    	slow=slow.next;

    }
//    System.out.println("prinitng middle element");
//    System.out.println(slow.data);
    
//    System.out.println("deletion");
//    llist.deleteNode(55);
//    System.out.println("new list");
//    llist.printNode();
   // System.out.println(llist.size());
    System.out.println("insert at middle");
    llist.insertAtMiddle(25, 4);
    llist.printNode();
    System.out.println("reverse list");
    llist.reverse();

}
}
