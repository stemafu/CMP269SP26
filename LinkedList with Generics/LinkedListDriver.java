
public class LinkedListDriver {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		LinkedList<String> list2 = new LinkedList<String>();
		/*
		list.add(50);
		list.add(10);
		list.add(80);
		list.add(70, 1);
		
		*/
		
		for(int i = 0; i < 100; i++) {
			list.add(i + 1);
		}
		


		CustomIterator<Integer> it = new CustomIterator<Integer>(list);
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
