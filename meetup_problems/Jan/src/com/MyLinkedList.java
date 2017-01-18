package com;

public class MyLinkedList {
	Node meta;
	
	public MyLinkedList() {
		meta = new Node(0);
	}
	
	public int count(){
		return meta.data;
	}
	
	public boolean isEmpty(){
		return meta.next == null;
	}
	
	public void addToHead(int num){
		Node newNode = new Node(num);
		newNode.next = meta.next;
		meta.next = newNode;
		meta.data++;
	}
	
	public void addToHead(Node n){
		n.next = meta.next;
		meta.next = n;
		meta.data++;
	}
	
	public void iterate(){
		Node temp = meta.next;
		while(temp != null){
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
	}
	
	public int search(int key){
		Node temp = meta.next;
		int index = 0;
		while (temp != null){
			if(temp.data == key){
				System.out.println("Found");
				return index;
			}
			temp = temp.next;
			index++;
		}
		System.out.println("Not found");
		return -1;
	}
	
	public void kthFromLast(int k){
		int length = 0;
		Node temp = meta.next;
		while(temp != null){
			temp = temp.next;
			length++;
		}
		
		Node temp1 = meta;
		if(length < k){
			System.out.println("k should be less than the size of the list");
		}
		else {
			for(int i=0;i<length-k+1;i++){
				temp1 = temp1.next;
			}
			System.out.println("kth :" + temp1.data);
		}
	}
	
	public int removeDataFromHead(){
		return removeFromHead().data;
	}
	
	public Node removeFromHead(){
		Node removedNode = meta.next;
		meta.next = meta.next.next;
		meta.data--;
		return removedNode;
	}
	
	public MyLinkedList reverse(){
		MyLinkedList listNew = new MyLinkedList();
		while(meta.next != null){
			Node temp = removeFromHead();
			listNew.addToHead(temp);
		}
		return listNew;
	}
	
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.addToHead(110);
		myList.addToHead(21);
		myList.addToHead(3);
		myList.addToHead(41);
		myList.addToHead(15);
		myList.addToHead(20);
		myList.iterate();
		myList.kthFromLast(2);
		System.out.println(myList.count());
		myList.search(20);
		System.out.println(" at : " + myList.search(5));
		System.out.println(" at : " + myList.search(200));
		myList.removeFromHead();
		myList.removeFromHead();
		myList.iterate();
		MyLinkedList reverseList = myList.reverse();
		reverseList.iterate();
		
		
	}
}

	class Node{
		int data;
		Node next;
	
	
		public Node(int data,Node next){
			this.data = data;
			this.next = next;
		}
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
