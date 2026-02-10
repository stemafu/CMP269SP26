public class Person implements PersonInterface {
	// These are instance variables
	private String name;
	private int age;
	private double gpa;
	private String emplid;
	
	/* Constructor
	 * 
	 * A constructor is a special method that does not have 
	 * return type but has the same name as the Class.
	 * 
	 * Constructors are used to create and initialize new objects.
	 * 
	 * A name of a parameter and an instance variable can be the same.
	 * When we create this situation, we need a way of differentiating
	 * the parameter and the instance variable.
	 * 
	 * We can to use the this keyword to refer to the instance variable.
	 */
	
	public Person(String name, int age, String emplid, double gpa) {
		this(name, age);
		//this();
		this.emplid = emplid;
		this.gpa = gpa;
	}
	
	public Person() {
		
		this.name = "Unknown";
		this.age = 0;
		this.gpa = 0.0;
		this.emplid = "00000000";
	}
	
	/*
	 * We can be able to define multiple constructors as far as the 
	 * parameters are different. The difference can be in terms of
	 * the amount of the parameters or their data types. This is called
	 * constructor overloading. Constructor overloading is the concept
	 * of defining multiple constructors within the same class.
	 */
	public Person(String name, int age,  double gpa, String emplid) {
		this(name, age);
		this.emplid = emplid;
		//this.gpa = gpa;
		this.setGpa(gpa);
	}

	public Person(String name, int age) {
		System.out.println("This constructor is being called from another constructor");
		this.name = name;
		this.age = age;
		
		this.emplid = "00000000";
		this.gpa = 0.0;
	}	
	
	
	/*
	 * Getter methods are used to view a value stored inside a variable.
	 * A getter method returns a value
	 */
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getEmplid() {
		return this.emplid;
	}
	
	public double getGpa() {
		return this.gpa;
	}
	
	/*
	 * The setters are used to update a value stored inside a variable.
	 * Setter take parameters, which in turn are used to make the update.
	 * Setter usually do not return a value.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/* One advantage we get from encapsulation is that when we use 
	 * getters, we can be able to filter the values that are placed into a
	 * variable. Use if statement for parameter checking
	 */
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
		
	}
	
	/**
	 * 
	 */
	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}
	
	/*
	 * 
	 */
	public void setGpa(double gpa) {
		if(gpa < 0.0 || gpa > 4.0) {
			this.gpa = 0.0;
		}else {
			this.gpa = gpa;
		}
	}
	
	public Person copy(Person personToBeCopied) {
		Person personCopy = null;
		personCopy = new Person();
		personCopy.age = personToBeCopied.age;
		//personCopy.name = "Mr No Name NYC Bronx";
		personCopy.name = personToBeCopied.name;
		
		
		return personCopy;
	}
	
	public void display() {
		System.out.println("Name: " + this.name);
	}
	
	public Person copy() {
		Person personCopy = new Person();
		
		
		personCopy.setAge(this.age);
		personCopy.setEmplid(this.getEmplid());
		personCopy.setGpa(this.getGpa());
		personCopy.setName(this.getName());
		
		return personCopy;
	}	
	
	
	public String toString() {
		return "Person [name: " + this.name + ", Age: " + this.age + ", emplid: "
				+ this.emplid + ", GPA: " + this.gpa + "]";
	}
	
	
	
	
	public boolean equals(Object object) {
		
		
		// Null check
		if(object == null) {
			return false;
		}
		
		// Compare the address of the calling object(this) and the parameter
		if(this == object) {
			return true;
		}
		
		
		if ( !(object instanceof Person)) {
			return false;
		}
		
		/* Typecast: Notice that our parameter is on object whose
		 * data type is an Object. However, we are comparing persons.
		 * 
		 * We need to convert the Object to Person.
		 */
		Person otherPerson = null;
		otherPerson = (Person)object;
		
		
	
		if(this.age != otherPerson.age) {
			return false;
		}else if(this.gpa != otherPerson.gpa) {
			return false;
		}else if((this.name == null) && (otherPerson.name != null)) {
			return false;
		}else if (!(this.name.equals(otherPerson.name))) {
			return false;
		}else if((this.emplid == null) && (otherPerson.emplid != null)) {
			return false;
		}else if(!(this.emplid.equals(otherPerson.emplid))) {
			return false;
		}
		
		
		return true;
	}
	/*public static void squares(int [] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 10;
		}
	}
	
	public static void modifyPersonInfo(Person person) {
		if (person != null) {
			person.name = "Bronx NY";
		}
	}*/
	
	
	public static void main(String[] args) {
		
		
		/*
		 * Recall that an object is created using the keyword new.
		 * 
		 * So let us create a person object.
		 * "Drink Water"
		 */
		
		Person p1 = new Person(null, 30, "12345678", 3.0);
		Person p2 = new Person("Blue Sky", 30, "87654321", 3.0);
		
		
		Person person3 = new Person("Blue Sky", 30, "87654321", 3.0);
		System.out.println(person3.equals(person3));
		
		
		//p1.copy(p2);
		
		
		//p2.setName("Light");
		//Person p3 = p2;
		//p2.display();
		//p3.name = "Light";
		//System.out.println(p3.name);
		//System.out.println(p2.name);
		
		//System.out.println(p1);
		
		//System.out.println(p1.toString());
		
		
		//modifyPersonInfo(p1);
		
		///System.out.println(p1.getName());
		
		//Person p4 = new Person();
		//p4.setAge(p2.age);
		//p4.setEmplid(p2.getEmplid());
		//p4.setGpa(p2.getGpa());
		//p4.setName(p2.getName());
		
		//p2.copy(p4);
		
		//p2.copy();
		
		//System.out.println(p4.getName());
		
		int [] array = {10, 5, 4, 6, 7};
		
		int [] arrayCopy = {100, 50, 40, 60, 70};
		
		
		//squares(array);
		
		for(int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
		}
		
		
		
		
	}

}
