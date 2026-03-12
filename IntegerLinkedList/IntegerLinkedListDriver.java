

public class IntegerLinkedListDriver {

	public static void main(String[] args) {
		
		IntegerLinkedList list = new IntegerLinkedList();
		
		list.add(80);
		list.add(50);
		list.add(12);
		list.add(90);
		System.out.println(list.remove(2));
		list.add(34);
		list.add(4);
		list.add(3);
		list.add(102, 4);
		list.add(109, 0);
		list.add(120, 9 );
		list.replace(1000, 0);
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		//list.add(10);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		///list.add(20);
		
		//System.out.println(list.get(0));
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}		
		System.out.println(list.isEmpty());
		System.out.println(list.size());

	}

}
