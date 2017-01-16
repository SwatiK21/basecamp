package com;

public class SortedList extends MyLinkedList {
	
	public int addInSortedOrder(int num){
		Node temp = meta.next;
		int searchCount = 0;
		
		if(temp == null){
			System.out.println("List is empty, inserting the element");
			addToHead(num);
			return searchCount;
		}
		
		if(num <= temp.data){
			System.out.println("Inserting the element at the first  position");
			addToHead(num);
			return searchCount;
		}
		
		while(temp.next != null){
			
			if((num >= temp.data) & (num <= temp.next.data)){
				Node newNode = new Node(num);
				newNode.next = temp.next;
				temp.next = newNode;
				return searchCount;
			}
			temp = temp.next;
			searchCount++;
			System.out.println("search before last : " + searchCount);
		}
		
		
		
		Node newNode = new Node(num);
		newNode.next = null;
		temp.next = newNode;
		System.out.println("search after last position : " + searchCount);
		return searchCount;
		
	}
	
	
	
	
	public static void main(String[] args) {
		SortedList myList1 =  new SortedList();
		SortedList myList2 =  new SortedList();
		
		myList1.addInSortedOrder(20);
		myList1.addInSortedOrder(15);
		myList1.addInSortedOrder(25);
		myList1.addInSortedOrder(50);
		myList1.addInSortedOrder(12);
		
	
		System.out.println();
		
		myList2.addInSortedOrder(2);
		myList2.addInSortedOrder(5);
		myList2.addInSortedOrder(1);
		myList2.addInSortedOrder(0);
		myList2.addInSortedOrder(12);
		myList2.removeFromHead();
		myList2.removeFromHead();
		
		myList1.iterate();
		System.out.println("-----------------");
		myList2.iterate();
	}

}
