import java.util.Iterator;
import java.util.Vector;

public class CustomIterator<T> implements Iterator<T> {

	//private Vector<T> listForIteration;
	
	//private Node<T> currentNode;
	private LinkedList<T> list;
	
	private int count = 0;
	
	public CustomIterator(LinkedList<T> list) {
		
		this.list = list;
		
	}

	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return count < this.list.size();
	}

	@Override
	public T next() {
		
		T element = list.get(count);
		count++;
		return element;
	}

}
