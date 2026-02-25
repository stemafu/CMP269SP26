


public class IntegerBasedBetterArray implements ListInterface{
	
	private final int CAPACITY = 10;
	
	
	/*
	 * A regular int array that will keep a list of items
	 */
	private int [] elements;
	
	/*
	 * I need another variable to keep track of the 
	 * current total number of elements in the array. 
	 */
	private int numElements;
	
	
	public IntegerBasedBetterArray() {
		this.elements = new int[CAPACITY];
		this.numElements = 0;
	}
	
	
	@Override
	public boolean isEmpty() {
		/*if(this.numElements == 0) {
			return true;
		}else {
			return false;
		}*/
		
		/* This is called a boolean expression (this.numElements == 0).
		 * A boolean expression evaluates to true or false.
		 */
		return (this.numElements == 0);
	}

	@Override
	public int size() {
		
		return this.numElements;
	}


	
	@Override
	public void add(int num) {
		
		
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
		
		
		this.elements[this.numElements] = num;
		numElements++;	
	}
	
	
	private void resize() {
		// Step 1: create a new bigger array than the original array that is currently full.
		// The easiest way it just to double the size.
		int [] elementsCopy = new int[ (this.elements.length * 2) ];
		
		// Step 2: copy the elements from the old array to the new bigger array.
		for(int i = 0; i < this.numElements; i++) {
			elementsCopy[i] = elements[i];
		}
		
		// Update the address of the old array to be of the new array
		elements = elementsCopy;
	}

	@Override
	public void add(int num, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSorted(int num) {
		// TODO Auto-generated method stub
		
	}
    
	
	@Override
	public int get(int index) {
		
		if(index < 0 || index >= this.numElements) {
			// we will address this part later
			System.out.println("Error");
		}
		
		
		return this.elements[index];
	}

	@Override
	public int remove(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int replace(int num, int index) {
		// TODO Auto-generated method stub
		return 0;
	}

}
