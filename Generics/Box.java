
public class Box<T> {
	
	private T data;
	
	public Box(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	public static void main(String[] args) {

		Box<Integer> box = new Box<Integer>(10);
		//box.setData("two");
		System.out.println(box.getData());
		
		
		Box<String> box1 = new Box<String>("two");
		

	}

}
