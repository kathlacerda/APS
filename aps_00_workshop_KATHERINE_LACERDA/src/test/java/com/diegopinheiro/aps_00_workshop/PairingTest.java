package com.diegopinheiro.aps_00_workshop;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;



public class PairingTest {
	
	private static String MESSAGE = "Cannot obtain pairs with different sizes!";
	
	@Test
	public void getPairsZero() {
		String s1 = "";
		String s2 = "";
		try {
			Pairing pairing = new Pairing(s1, s2);
			Pair[] actual = pairing.getPairs();
			Pair[] expected = new Pair[0];
			Assert.assertArrayEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void printPairsZero() {
		String s1 = "";
		String s2 = "";
		try {
			Pairing pairing = new Pairing(s1, s2);
			String actual = pairing.toString();
			String expected = "";
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void getPairsOne() {
		String s1 = "Person 1";
		String s2 = "Person 2";
		try {
			Pairing pairing = new Pairing(s1, s2);
			Pair[] actual = pairing.getPairs();
			Pair pairOne = new Pair("Person 1", "Person 2");
			Pair[] expected = new Pair[1];
			expected[0] = pairOne;
			Assert.assertArrayEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void printPairsOne() {
		String s1 = "Person 1";
		String s2 = "Person 2";
		try {
			Pairing pairing = new Pairing(s1, s2);
			String actual = pairing.toString();
			String expected = "(Person 1, Person 2)";
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void threePairings() {
		String s1 = "Person 1, Person 3, Person 5";
		String s2 = "Person 2, Person 4, Person 6";
		
		try {
			Pairing pairing = new Pairing(s1, s2);
			String actual = pairing.toString();
			String expected = 
					"(Person 1, Person 2), "
					+ "(Person 3, Person 4), "
					+ "(Person 5, Person 6)";
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void threePairingsDifferentSizesLeftGreater() {
		String s1 = "Person 1, Person 3, Person 5";
		String s2 = "Person 2, Person 4";
	
		try {
			Pairing pairing = new Pairing(s1, s2);
			fail(MESSAGE);
		} catch (Exception e) {
			Assert.assertEquals(MESSAGE, e.getMessage());
		}
		
	}

	@Test
	public void threePairingsDifferentSizesRightGreater() {
		String s1 = "Person 1, Person 3";
		String s2 = "Person 2, Person 4, Person 6";
		try {
			Pairing pairing = new Pairing(s1, s2);
			fail(MESSAGE);
		} catch (Exception e) {
			Assert.assertEquals(MESSAGE, e.getMessage());
		}
		
	}
}
