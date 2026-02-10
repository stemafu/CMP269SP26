

/**
 * The Class that will implement this interface will need to have name,
 * age, emplid, and gpa.
 */

public interface PersonInterface {
	
	/**
	 * The following method is used to set the name of a person.
	 * @param name
	 */
	public void setName(String name);
	
	/**
	 * This sets the age of a person
	 * @param age
	 */
	public void setAge(int age);
	
	/**
	 * This sets the emplid id of a person.
	 * @param emplid
	 */
	
	public void setEmplid(String emplid);
	
	/**
	 * This returns the name of a person
	 * @return
	 */
	public String getName();

}
