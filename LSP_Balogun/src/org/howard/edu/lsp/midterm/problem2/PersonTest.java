package org.howard.edu.lsp.midterm.problem2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Farouk Balogun
 * @author olaol
 *
 */

public class PersonTest {
	@Test
	@DisplayName("Test cases for Person.equals()")
	public void testEquals() {
		Person person1 = new Person("John", "123-12-1212", 18);
		Person person2 = new Person("David", "123-12-1212", 21);
		Person person3 = new Person("John", "123-66-1212", 18);
		Person person4 = new Person("David", "123-12-2012", 21);
		String nonPersonObj = "David";
		assertFalse(person2.equals(nonPersonObj));
		assertTrue(person1.equals(person2));
		assertTrue(person2.equals(person1));
		assertFalse(person1.equals(person3));
		assertFalse(person4.equals(person2));
	}
	
	@Test
	@DisplayName("Test cases for Person.toString()")
	public void testToString() {
		Person person1 = new Person("John", "123-12-1212", 18);
		Person person2 = new Person("David", "653-12-1212", 21);
		Person person3 = new Person("Mary", "143-66-1212", 19);
		Person person4 = new Person("Daniel", "121-12-2012", 20);
		assertEquals("Name: John, Age: 18, SSN: 123-12-1212", person1.toString());
		assertEquals("Name: David, Age: 21, SSN: 653-12-1212", person2.toString());
		assertEquals("Name: Mary, Age: 19, SSN: 143-66-1212", person3.toString());
		assertEquals("Name: Daniel, Age: 20, SSN: 121-12-2012", person4.toString());
	}
}
