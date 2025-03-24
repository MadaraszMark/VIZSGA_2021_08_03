package task05.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import task05.model.Estate;

public class TestEstate {

	@Test
	public void testGetEstateSaleText() {
		Estate estateObj = new Estate(
				99,
				"Teszt ingatlan",
				99,
				9,
				"Teszt város",
				"1111",
				"Teszt u. 11.",
				99,
				1,
				true,
				false
				);
		String actual = estateObj.getSaleText();
		String expected = "Akciós";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetEstateStatusText() {
		Estate estateObj = new Estate(
				99,
				"Teszt ingatlan",
				99,
				9,
				"Teszt város",
				"1111",
				"Teszt u. 11.",
				99,
				1,
				true,
				false
				);
		String actual = estateObj.getStatusText();
		String expected = "Aktív";
		assertEquals(expected, actual);
	}
}
