package task01.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import task01.GenerateUserName;
import task01.User;

public class TestGenerateUserName {

	@Test
	public void testUserNameGeneteFirstPart() {
		User userObj = new User("ELek", "Teszt");
		GenerateUserName generateUserNameObj = new GenerateUserName();
		generateUserNameObj.generateUserName(userObj, 10, 20);
		String expected = "TEele";
		String actual = userObj.getUserName().substring(0,5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUserNameContainsSnake() {
		User userObj = new User("ELek", "Teszt");
		GenerateUserName generateUserNameObj = new GenerateUserName();
		generateUserNameObj.generateUserName(userObj, 10, 20);
		assertTrue(userObj.getUserName().contains("_"));
	}
	
	@Test
	public void testRandomNumberLessThan51() {
		User userObj = new User("ELek", "Teszt");
		GenerateUserName generateUserNameObj = new GenerateUserName();
		generateUserNameObj.generateUserName(userObj, 1, 50);
		String[] data = userObj.getUserName().split("_");
		int randomNumber =Integer.parseInt(data[1]);
		boolean actual = randomNumber<51;
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRandomNumberMoreOrEqual1() {
		User userObj = new User("ELek", "Teszt");
		GenerateUserName generateUserNameObj = new GenerateUserName();
		generateUserNameObj.generateUserName(userObj, 1, 100);
		String[] data = userObj.getUserName().split("_");
		int randomNumber =Integer.parseInt(data[1]);
		boolean actual = randomNumber>=1;
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRandomNumberLessThan1() {
		User userObj = new User("ELek", "Teszt");
		GenerateUserName generateUserNameObj = new GenerateUserName();
		generateUserNameObj.generateUserName(userObj, 1, 100);
		String[] data = userObj.getUserName().split("_");
		int randomNumber =Integer.parseInt(data[1]);
		boolean actual = randomNumber<1;
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUserNameMinLenght() {
		User userObj = new User("ELek", "Teszt");
		GenerateUserName generateUserNameObj = new GenerateUserName();
		generateUserNameObj.generateUserName(userObj,1,100);
		boolean actual = userObj.getUserName().length()>6? true : false;
		boolean expected = true; 
		assertEquals(expected,actual);
	}
	
	@Test
	public void testUserNameContainsLastNameFirst2Letter() {
		User userObj = new User("ELek", "Teszt");
		GenerateUserName generateUserNameObj = new GenerateUserName();
		generateUserNameObj.generateUserName(userObj,1,100);
		assertTrue(userObj.getUserName().contains("TE"));
	}
}
