package task03.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import task03.PcPart;

public class TestIsAvailable {

	@Test
	public void isAvailableSetFalse() {
		PcPart pcPartObject = new PcPart(
				1,
				"ASUS alaplap R400",
				"TGO-120401",
				"ASUS",
				"R400",
				0,
				35000,
				false
		);
		boolean actual = pcPartObject.isAvailable();
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isAvailableSetTrue() {
		PcPart pcPartObject = new PcPart(
				1,
				"ASUS alaplap R400",
				"TGO-120401",
				"ASUS",
				"R400",
				1,
				35000,
				false
		);
		boolean actual = pcPartObject.isAvailable();
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isAvailableSetFalseNegativStockAmount() {
		PcPart pcPartObject = new PcPart(
				1,
				"ASUS alaplap R400",
				"TGO-120401",
				"ASUS",
				"R400",
				-1,
				35000,
				false
		);
		boolean actual = pcPartObject.isAvailable();
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
