
public class IntegerLinkedList implements ListInterface {

	/*
	 * A linkedlist is a data structure consisting of nodes.
	 * Each node contains data and an address to the next node.
	 * 
	 * The entry point of a linkedlist is the head. 
	 * 
	 * We need to create an instance variable head that will represent
	 * the entry point of the linkedlist.
	 * 
	 * The head contains the address to the first node. If
	 * the linkedlist is empty, the head will contain null.
	 */
	Node head;

	/* we can also have an instance node variable tail. The tail
	 * is used to keep track of the last node in the linkedlist.
	 * 
	 * The tail contains the address of the last node in the linkedlist.
	 * This tail allows easy access to the end of the list for adding a 
	 * new node.
	 * 
	 * If the list is empty, tail contains null.
	 * 
	 * If the list contains one node, both the head and the tail point
	 * to the same node. This is because this same node is the first and 
	 * the node is the last.
	 */
	Node tail;

	/*
	 * We will also need int instance variable to keep track of the
	 * amount of items that we are currently keeping in the linkedlist 
	 */
	int numElements;

	/*
	 * This create a linkedlist that is empty but we can be able 
	 * to add elements to this list once it has been created using the
	 * add(num) method or add(num, index) method. 
	 */
	public IntegerLinkedList() {
		this.head = null;
		this.tail = null;
		this.numElements = 0;
	}



	@Override
	public boolean isEmpty() {
		// return (head == null);
		// return (tail == null);
		return this.numElements == 0;
	}

	@Override
	public int size() {

		return this.numElements;
	}

	@Override
	public void add(int num) {
		/* This method is used to add the specified number
		 * to the end of the list.
		 * 
		 * This appending to the list.
		 * 
		 * The first thing we should is to create a node for the 
		 * specified num(data).
		 */
		Node node = new Node(num);

		if(this.isEmpty()) {
			this.head = node;
			// this.tail = node;
			// this.numElements++;
		}else {
			this.tail.next = node;
			// this.tail = node;
			// this.numElements++;
		}
		this.tail = node;
		this.numElements++;

	}

	@Override
	public void add(int num, int index) throws ArrayIndexOutOfBoundsException {
		if(index < 0 || index > this.numElements) {
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index);
		}

		if( (this.isEmpty() && index == 0) || (index == this.numElements)     ) {
			this.add(num);
		}else if(index == 0 && !this.isEmpty()) {
			// Make a node
			Node node = new Node(num);
			node.setNext(this.head);
			head = node;
			this.numElements++;
		}/*else if(index == this.numElements) {
			// Make a node
			Node node = new Node(num);
			this.tail.setNext(node);
			this.tail = node;
			this.numElements++;
		}*/
		else {
			Node node = new Node(num);
			Node currentNode = this.head;
			Node previousNode = null;
			int currentNodeIndex = 0;

			while(currentNodeIndex < index) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				currentNodeIndex++;
			}

			previousNode.setNext(node);
			node.setNext(currentNode);
			numElements++;
		}
	}

	@Override
	public void addSorted(int num) {
		// TODO Auto-generated method stub

	}

	@Override
	public int get(int index) throws ArrayIndexOutOfBoundsException {

		if(index < 0 || index >= this.numElements) {
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index);
		}

		Node currentNode = this.head;
		int currentNodeLocation = 0;

		while(currentNodeLocation < index) {
			currentNode = currentNode.next;
			currentNodeLocation++;
		}


		return currentNode.data;
	}

	@Override
	public int remove(int index) throws ArrayIndexOutOfBoundsException {
		
		if(index < 0 || index >= this.numElements) {
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index);
		}
		
		int removedElement;
		
		if(index == 0 && numElements == 1) {
			removedElement = this.head.getData();
			this.removeAll();
			return removedElement;
		}else if (index == 0){
			removedElement = this.head.getData();
			Node nodeTobeRemoved = this.head;
			this.head = nodeTobeRemoved.getNext();
			nodeTobeRemoved.setNext(null);
			this.numElements--;
		}else {
			 int currentNodeIndex = 0;
			 Node currentNode = this.head;
			 Node previousNode = null;
			 
			 while(currentNodeIndex < index) {
				 previousNode = currentNode;
				 currentNode = currentNode.getNext();
				 currentNodeIndex++;
				 
			 }
			
			
		}
		
		
		
		
		return 0;
	}

	@Override
	public void removeAll() {

		this.head = null;
		this.tail = null;
		this.numElements = 0;

	}

	@Override
	public int replace(int num, int index) throws ArrayIndexOutOfBoundsException {
		if(index < 0 || index >= this.numElements) {
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index);
		}

		int replacedElement;
		if(index == 0) {
			replacedElement = this.head.getData();
			this.head.setData(num);
		}else if(index == (this.numElements - 1)) {
			replacedElement = this.tail.getData();
			this.tail.setData(num);
		}else {

			Node currentNode = this.head;
			int currentNodeLocation = 0;

			while(currentNodeLocation < index) {
				currentNode = currentNode.next;
				currentNodeLocation++;
			}
			
			replacedElement = currentNode.getData();
			currentNode.setData(num);

		}


		return replacedElement;
	}

}
