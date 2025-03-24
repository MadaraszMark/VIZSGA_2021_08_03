package task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromConsole {

	@SuppressWarnings("unused")
	public User getUserData() {
		
		String firstName = null;
		String lastName = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Kérem adja meg a vezetéknevét: ");
			lastName = br.readLine();
			System.out.print("Kérem adja meg a keresztnevét: ");
			firstName = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User userObj = new User(firstName, lastName);
		return userObj;
	}
	
	public int getRandomInterval(String message) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		int randomInterval = 0;
		try {
			randomInterval = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println("Hibás értéket adott meg :(");
		} catch (IOException e) {
			System.err.println("Hibás értéket adott meg :(");
		}
		return randomInterval;
	}
}
