package task02.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import task02.Bicycle;

public class TestSetSaleNetPrice {

	@Test
	public void testSetSaleNetPriceCalculate() {
		Bicycle bicycleObj = new Bicycle(1, "GIANT", "G-1000", 100000, true);
		bicycleObj.setSaleNetPrice(20);
		double actual = bicycleObj.getNetPrice();
		double expected = 80000;	
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNetPriceIsNotNegativ() {
		Bicycle bicycleObj = new Bicycle(1, "GIANT", "G-1000", 100000, true);
		boolean actual = bicycleObj.getNetPrice() > 0;
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNetPriceIsNegativ() {
		Bicycle bicycleObj = new Bicycle(1, "GIANT", "G-1000", -100000, true);
		boolean actual = bicycleObj.getNetPrice() < 0;
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetSaleNetPriceCalculateWhenNullPercentGiven() {
		Bicycle bicycleObj = new Bicycle(1, "GIANT", "G-1000", 100000, true);
		bicycleObj.setSaleNetPrice(0);
		double actual = bicycleObj.getNetPrice();
		double expected = 100000;	
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsAvailableTextAvailable() {
		Bicycle bicycleObj = new Bicycle(1, "GIANT", "G-1000", 100000, true);
		String actual = bicycleObj.getIsAvailableTxt();
		String expected = "elérhető";	
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsAvailableTextNotAvailable() {
		Bicycle bicycleObj = new Bicycle(1, "GIANT", "G-1000", 100000, false);
		String actual = bicycleObj.getIsAvailableTxt();
		String expected = "nem elérhető";	
		assertEquals(expected, actual);
	}
}
