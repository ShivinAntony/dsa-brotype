package com.shivin.brototype;

public class DLinkedList {
	
	class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			
			this.data =data;
		}
	}
	
	public Node head;
	public Node tail;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
		}
		tail =newNode;
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp =temp.next;
		}
	}
	public void displayReverse() {
		Node temp = tail;
		while(temp != null) {
			System.out.println(temp.data);
			temp =temp.prev;
		}
	}
	
	public static void main(String[] args) {
		DLinkedList list =new DLinkedList();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.display();
		
		System.out.println("Reverse ");
		
		list.displayReverse();
	}

}
