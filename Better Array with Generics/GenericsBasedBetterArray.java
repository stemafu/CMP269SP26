
public class GenericsBasedBetterArray<T> implements ListInterface<T> {

	
	private final int CAPACITY = 10;
	private Object [] elements;
	private int numElements;
	
	public GenericsBasedBetterArray() {
		this.elements = new Object[CAPACITY];
		this.numElements = 0;
	}
	
	
	@Override
	public boolean isEmpty() {
		
		return (this.numElements == 0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}

	@Override
	public void add(T element) {
		
		if(this.numElements == this.elements.length ) {
			/*
			 * This, this.numElements == this.elements.length, is checking to see 
			 * if the the current array is full. If the array is full, there is no
			 * space to add a new value.
			 * 
			 * We need to resize our array so that we can create room for the new value
			 * that is to be added.
			 */
			this.resize();
		}		
		
		
		this.elements[numElements] = element;
		this.numElements++;
		
	}

	
	private void resize() {
		// Step 1: create a new bigger array than the original array that is currently full.
		// The easiest way it just to double the size.
		Object [] elementsCopy = new Object[ (this.elements.length * 2) ];
		
		// Step 2: copy the elements from the old array to the new bigger array.
		for(int i = 0; i < this.numElements; i++) {
			elementsCopy[i] = elements[i];
		}
		
		// Update the address of the old array to be of the new array
		elements = elementsCopy;
	}
	
	
	
	@Override
	public void add(T element, int index) {
		if(index < 0 || index > this.numElements) {
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index + " has been provided for a list of length " + this.numElements);
		}
		
		if(this.numElements == this.elements.length ) {
			/*
			 * This, this.numElements == this.elements.length, is checking to see 
			 * if the the current array is full. If the array is full, there is no
			 * space to add a new value.
			 * 
			 * We need to resize our array so that we can create room for the new value
			 * that is to be added.
			 */
			this.resize();
		}
		
		for(int i = this.numElements; i > index; i--) {
			this.elements[i] = this.elements[i - 1];
		}
		
		this.elements[index] = element;
		this.numElements++;
		
	}

	@Override
	public void addFront(T element) {
		// TODO Auto-generated method stub
		
	}

	//@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		if(index < 0 || index >= this.numElements) {
			return null;
		}
		
		return (T)elements[index];
	}

	@Override
	public T replace(T element, int index) {
		checkForValidIndex(index);
		
		T replacedElement = (T)this.elements[index];
		
		this.elements[index] = element;
		return replacedElement;
	}
	
	private void checkForValidIndex(int index) {
		if(index < 0 || index >= this.numElements) {
			// we will address this part later
			throw new ArrayIndexOutOfBoundsException("Invalid index " + index + " has been provided for a list of length " + this.numElements);
		}
	}

	@Override
	public T remove(int index) {
		this.checkForValidIndex(index);
		
		/*
		 * keep the value that is being removed into a 
		 * separate variable before it is taken out.
		 * This value will be returned by the method.
		 */
		T removedElement = (T)this.elements[index];
		
		// Shift the values up
		
		for(int i = index; i < this.numElements - 1; i++) {
			this.elements[i] = this.elements[i + 1];
		}
		this.numElements--;
		
		return removedElement;
	}

	@Override
	public void removeAll() {
		this.elements = new Object[CAPACITY];
		this.numElements = 0;
		
	}
	
	public static void main(String [] args) {
		
		
		GenericsBasedBetterArray<Integer> list = new GenericsBasedBetterArray<Integer>();
		
		list.add(10);
		list.add(20);
		
		System.out.println(list.get(3));
		
		GenericsBasedBetterArray<String> list2 = new GenericsBasedBetterArray<String>();
		
	}

}
