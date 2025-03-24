package task01;

import java.util.Random;

public class GenerateUserName {

	public void generateUserName(User userObj, int minInterval, int maxInterval) {
		String userName = userObj.getLastName().substring(0, 2).toUpperCase() + userObj.getFirstName().substring(0, 3).toLowerCase();	
		userName +="_";
		Random r = new Random();
		int rand = r.nextInt(maxInterval - minInterval + 1) + minInterval;
		userName += rand;
		userObj.setUserName(userName);
	}
}
