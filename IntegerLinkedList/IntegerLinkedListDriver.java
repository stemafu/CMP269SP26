
public class IntegerLinkedListDriver {

	public static void main(String[] args) {
		
		IntegerLinkedList list = new IntegerLinkedList();
		
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
