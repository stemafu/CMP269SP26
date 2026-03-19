
public class LinkedList <T> implements ListInterface<T> {


	private int numElements = 0;

	private Node<T> head;
	private Node<T> tail;


	public LinkedList() {
		this.numElements = 0;
		this.head = null;
		this.tail = null;
	}

	@Override
	public boolean isEmpty() {
		//return (this.head == null && this.tail == null);
		return (this.numElements == 0);
	}

	@Override
	public int size() {

		return this.numElements;
	}

	@Override
	public void add(T element) {

		if(element == null) {
			throw new NullPointerException("Element cannot be null");
		}

		Node<T> node = new Node<T>(element);

		if(this.isEmpty()) {
			head = node;
			tail = node;
			this.numElements++;
		}else {
			this.tail.setNext(node);
			node.setPrevious(tail);
			this.tail = node;
			this.numElements++;

		}



	}

	@Override
	public void add(T element, int index) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSorted(int num) {
		// TODO Auto-generated method stub

	}

	@Override
	public T get(int index) throws ArrayIndexOutOfBoundsException {


		if(index < 0 || index >= this.numElements) {
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index);
		}


		if(index == 0) {
			return this.head.getData();
		}else if (index == (this.numElements - 1)){
			return this.tail.getData();
		}else {
			int i = 0;
			Node<T> currentNode = this.head;

			while(i < index) {
				currentNode = currentNode.getNext();
				i++;
			}

			return currentNode.getData();
		}
	}

	@Override
	public T remove(int index) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {

		this.numElements = 0;
		this.head = null;
		this.tail = null;

	}

	@Override
	public T replace(T element, int index) throws ArrayIndexOutOfBoundsException {

		if(index < 0 || index >= this.numElements) {
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index);
		}

		T replacedElement = null;
		
		if(index == 0) {
			replacedElement = this.head.getData();
			this.head.setData(element);
		}else if (index == (this.numElements - 1)){
			replacedElement = this.tail.getData();
			this.tail.setData(element);	
		}else {
			int i = 0;
			Node<T> currentNode = this.head;

			while(i < index) {
				currentNode = currentNode.getNext();
				i++;
			}

			replacedElement = currentNode.getData();
			currentNode.setData(element);

			
		}




		return replacedElement;
	}

}
