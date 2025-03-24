package task04.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import task04.Pizza;

public class TestIdIsValid {

	@Test
	public void testIsIdLenghtValid() {
		Pizza pizzaObj = new Pizza("DRP-12345", "Füstölt sajtos", 3500, 40, false);
		boolean actual = pizzaObj.isIdLenghtValid();
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
    public void testIsIdLenghtInvalid() {
		Pizza pizzaObj = new Pizza("DRP-123457", "Füstölt sajtos", 3500, 40, false);
		boolean actual = pizzaObj.isIdLenghtValid();
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void getIsSaleText() {
		Pizza pizzaObj = new Pizza("DRP-12345", "Füstölt sajtos", 3500, 40, false);
        String actual = pizzaObj.getIsSaleText();
        String expected = "Nem akciós";
        assertEquals(expected, actual);
	}
	
}
