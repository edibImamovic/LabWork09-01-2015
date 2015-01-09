package ba.bitcamp.repeat;

public class LinkedListInt {

	Node head;
	int size;

	public LinkedListInt() {
		head = null;
		size = 0;
	}

	public void add(int value) {

		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
		} else {
			Node current = head;
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = newNode;
			size++;
		}

	}

	public String toString() {
		String str = "";
		Node current = head;
		while (current != null) {
			str += current.value + " ";
			current = current.nextNode;
		}
		return str;

	}

	private class Node {

		public int value;
		public Node nextNode;

		public Node(int value) {
			this.value = value;
			nextNode = null;

		}
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Size is not valid");
		}
		if (index == 0) {
			head = head.nextNode;
			size--;
			return;
		}
		Node current = head.nextNode;
		Node previous = head;
		int counter = 1;

		while (counter < index) {
			current = current.nextNode;
			previous = previous.nextNode;
			counter++;
		}

		previous.nextNode = current.nextNode;
		current.nextNode = null;
		size--;
	}
	
	public void add(int value, int index){
		
		if (index<0 || index >size){
			throw new IndexOutOfBoundsException("Size is not valid");
		}
		
		Node newNode = new Node(value);
		if (index == 0) {
			head = newNode;
			size++;
		} else {
			Node current = head.nextNode;
			Node previuos = head;
			int counter =1;
			
			while (counter < index ) {
				current = current.nextNode;
				previuos = previuos.nextNode;
				counter++;
			}
			previuos.nextNode = newNode;
			newNode.nextNode = current;
			size++;
		}
		
		
	}

}
