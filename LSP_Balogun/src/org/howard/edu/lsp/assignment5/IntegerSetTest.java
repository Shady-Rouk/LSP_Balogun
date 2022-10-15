package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Farouk Balogun
 * 
 * @author olaol
 *
 */

public class IntegerSetTest {
	@Test
	@DisplayName("IntegerSet.clear() test cases")
	public void testClear() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		assertFalse(set1.isEmpty());
		// testing clear on a non-empty set.
		set1.clear();
		assertTrue(set1.isEmpty());
		assertEquals("[]", set1.toString());
		// testing clear on an empty set.
		set1.clear();
		assertEquals("[]", set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.length() test cases")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		assertEquals(0, set1.length());
		set1.add(1);
		set1.add(1);
		set1.add(2);
		// testing length on a set after attempting to add duplicate integers.
		assertEquals(2, set1.length());
		assertNotEquals(3, set1.length());
	}
	
	@Test
	@DisplayName("IntegerSet.equals() test cases")
	public void testEquals() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		// testing equals with two empty sets.
		assertTrue(set1.equals(set2));
		assertTrue(set2.equals(set1));
		set1.add(1);
		set1.add(2);
		// testing equals with an empty set and a non-empty set.
		assertFalse(set1.equals(set2));
		assertFalse(set2.equals(set1));
		set2.add(2);
		set2.add(1);
		// testing equals with two non-empty sets.
		assertTrue(set1.equals(set2));
		assertTrue(set2.equals(set1));
	}
	
	@Test
	@DisplayName("IntegerSet.contains() test cases")
	public void testContains() {
		IntegerSet set1 = new IntegerSet();
		// testing contains on an empty set.
		assertFalse(set1.contains(1));
		assertFalse(set1.contains(2));
		assertFalse(set1.contains(3));
		set1.add(1);
		set1.add(2);
		// testing contains on a non-empty set.
		assertTrue(set1.contains(1));
		assertTrue(set1.contains(2));
		assertFalse(set1.contains(3));
	}
	
	@Test
	@DisplayName("IntegerSet.largest() test cases")
	public void testLargest() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(-1);
		set2.add(-2);
		set2.add(-3);
		set3.add(0);
		set3.add(-1);
		set3.add(-2);
		try {
			// testing largest when the largest integer is a positive integer.
			assertEquals(3, set1.largest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			// testing largest when the largest integer is a negative integer.
			assertEquals(-1, set2.largest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			// testing largest when the largest integer is zero.
			assertEquals(0, set3.largest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	@DisplayName("Test case for when IntegerSet.largest() throws an IntegerSetExeption")
	public void testLargest_THROWS_IntegerSetException() {
		IntegerSet set1 = new IntegerSet();
		IntegerSetException exception = assertThrows(IntegerSetException.class, () -> {
			System.out.println(set1.largest());
		});
		// testing that largest throws an IntegerSetException when called on an empty set.
		assertEquals("Error calling largest(). The IntegerSet is empty.", exception.getMessage());
	}
	
	@Test
	@DisplayName("IntegerSet.smallest() test cases")
	public void testSmallestt() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(-1);
		set2.add(-2);
		set2.add(-3);
		set3.add(0);
		set3.add(1);
		set3.add(2);
		try {
			// testing smallest when the smallest integer is a positive integer.
			assertEquals(1, set1.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			// testing smallest when the smallest integer is a negative integer.
			assertEquals(-3, set2.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			// testing smallest when the smallest integer is zero.
			assertEquals(0, set3.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	@DisplayName("Test case for when IntegerSet.smallest() throws an IntegerSetExeption")
	public void testSmallest_THROWS_IntegerSetException() {
		IntegerSet set1 = new IntegerSet();
		IntegerSetException exception = assertThrows(IntegerSetException.class, () -> {
			System.out.println(set1.smallest());
		});
		// testing that smallest throws an IntegerSetException when called on an empty set.
		assertEquals("Error calling smallest(). The IntegerSet is empty.", exception.getMessage());
	}
	
	@Test
	@DisplayName("IntegerSet.add() test cases")
	public void testAdd() {
		IntegerSet set1 = new IntegerSet();
		assertFalse(set1.contains(1));
		// testing that add properly includes elements to a set without duplicates.
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		assertTrue(set1.contains(1));
		assertTrue(set1.contains(2));
		assertTrue(set1.contains(3));
	}
	
	@Test
	@DisplayName("IntegerSet.remove() test cases")
	public void testRemove() {
		IntegerSet set1 = new IntegerSet();
		assertFalse(set1.contains(1));
		set1.add(1);
		set1.add(2);
		set1.add(3);
		assertTrue(set1.contains(1));
		assertTrue(set1.contains(2));
		assertTrue(set1.contains(3));
		set1.remove(1);
		set1.remove(2);
		// testing that remove does not do anything if the item is not in the set.
		set1.remove(20);
		assertFalse(set1.contains(1));
		assertFalse(set1.contains(2));
		assertTrue(set1.contains(3));
	}
	
	@Test
	@DisplayName("IntegerSet.union() test cases")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.union(set2);
		// testing union with two empty sets.
		assertEquals("[]", set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set1.union(set2);
		// testing union with two non-empty sets.
		assertEquals("[1, 2, 3, 4, 5, 6]", set1.toString());
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.union(set1);
		// testing union with two non-empty sets that have the same elements.
		assertEquals("[4, 5, 6, 1, 2, 3]", set2.toString());
		set3.union(set2);
		// testing union with an empty set and a non-empty set.
		assertEquals("[4, 5, 6, 1, 2, 3]", set3.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.intersect() test cases")
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.intersect(set2);
		// testing intersect with two empty sets.
		assertEquals("[]", set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set1.intersect(set2);
		// testing intersect with two non-empty sets.
		assertEquals("[3, 4]", set1.toString());
		set1.clear();
		set1.add(1);
		set1.add(2);;
		set1.intersect(set2);
		// testing intersect with two non-empty sets without any elements in common.
		assertEquals("[]", set1.toString());
		set2.intersect(set3);
		// testing intersect with a non-empty set and an empty set.
		assertEquals("[]", set2.toString());
		set1.add(1);
		set3.intersect(set1);
		// testing intersect with an empty set and a non-empty set.
		assertEquals("[]", set3.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.diff() test cases")
	public void testDiff() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.diff(set3);
		// testing diff with two empty sets.
		assertEquals("[]", set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set1.diff(set2);
		// testing diff with two non-empty sets.
		assertEquals("[2, 4]", set1.toString());
		set3.diff(set2);
		// testing diff with an empty set and a non-empty set.
		assertEquals("[]", set3.toString());
		set2.diff(set1);
		// testing diff with two non-empty sets without any elements in common.
		assertEquals("[1, 3, 5]", set2.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.isEmpty() test cases")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet();
		// testing isEmpty on an empty set.
		assertTrue(set1.isEmpty());
		set1.add(1);
		set1.add(2);
		// testing isEmpty on a non-empty set.
		assertFalse(set1.isEmpty());
		set1.remove(1);
		// testing isEmpty on a non-empty set after removing one of two elements.
		assertFalse(set1.isEmpty());
		set1.clear();
		// testing isEmpty on a set after calling clear.
		assertTrue(set1.isEmpty());
	}
	
	@Test
	@DisplayName("IntegerSet.toString() test cases")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		// testing toString on an empty set.
		assertEquals("[]", set1.toString());
		set1.add(2);
		set1.add(1);
		set1.add(1);
		// testing toString on a set that tried to add duplicate integers.
		assertNotEquals("[2, 1, 1]", set1.toString());
		assertEquals("[2, 1]", set1.toString());
		set1.clear();
		// testing toString on a set after calling clear.
		assertEquals("[]", set1.toString());
	}
}
