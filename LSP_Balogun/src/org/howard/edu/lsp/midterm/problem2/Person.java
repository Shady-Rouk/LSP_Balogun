package org.howard.edu.lsp.midterm.problem2;

/**
 * Farouk Balogun
 * @author olaol
 *
 */
public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;
	
	/**
	 * Constructor for a Person object.
	 * @param name The name of the person.
	 * @param socialSecurityNumber The Social Security Number of the person.
	 * @param age The age of the person.
	 */
	public Person(String name,  String socialSecurityNumber, int age) {
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	/**
	 * Compares two Person objects and returns true if they are equal. false otherwise.
	 * Two Person objects are equal if they have the same social security number.
	 * @param p2
	 * @return true if they are equal, false otherwise.
	 */
	public boolean equals(Object o2) {
		if (!(o2 instanceof Person)) {
			return false;
		}
		Person person2 = (Person) o2;
		if (this.socialSecurityNumber.equals(person2.socialSecurityNumber)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Returns a string representation of a Person with their name, age and Social Security Number.
	 * @return A string with the perosn's name, age and social security number.
	 */
	public String toString() {
		String returnString;
		Integer personAge = this.age;
		returnString = "Name: " + this.name + ", Age: " + personAge.toString() + ", SSN: " + socialSecurityNumber;
		return returnString;
	}

}
