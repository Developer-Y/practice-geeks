package com.practice.geeks.list;

public class Node {

	public int data;
	public Node next;
	
	public Node(int data){
		this(data, null);
	}
	
	public Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}
