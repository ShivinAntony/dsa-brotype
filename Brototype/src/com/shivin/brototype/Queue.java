package com.shivin.brototype;

import com.shivin.brototype.Stack.Node;

public class Queue {

	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node front;
	public Node rear;
	
	void enqueue(int data) {
		Node newNode = new Node(data);
		
		if(rear == null) {
			front = rear = newNode;
			return;
		}
		
		rear.next =newNode;
		rear = newNode;
	}
	
	void dequeue() {
		if(front == null) {
			System.out.println("Empty");
		}
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		
	}
	public void display() {
		Node current = front;
		
		if(current == null) {
			System.out.println("list is empty");
			return;
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		queue.dequeue();
		queue.display(); 
	}

}
