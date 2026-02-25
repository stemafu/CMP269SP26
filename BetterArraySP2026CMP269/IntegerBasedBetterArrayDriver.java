
public class IntegerBasedBetterArrayDriver {

	public static void main(String[] args) {
		IntegerBasedBetterArray list = new IntegerBasedBetterArray();
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add(90);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(80);
		list.add(95);
		list.add(19);
		list.add(45);
		list.add(34);
		list.add(37);
		list.add(27);
		
		//for(int i = 1; i <= 10000000; i++) {
		///	list.add(i);
		//}
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(12));

	}

}
