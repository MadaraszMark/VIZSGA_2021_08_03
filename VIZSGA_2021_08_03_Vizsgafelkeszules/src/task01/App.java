package task01;

public class App {

	public static void main(String[] args) {

		ReadDataFromConsole readUserDataObj = new ReadDataFromConsole();
		User userObj = readUserDataObj.getUserData();
		GenerateUserName generateUserNameObj = new GenerateUserName();
		int minInterval = 0;
		int maxInterval = 0;
		do {
			minInterval = readUserDataObj.getRandomInterval("Kérem adja meg az intervallum minimum értékét: ");
			maxInterval = readUserDataObj.getRandomInterval("Kérem adja meg az intervallum maximum értékét: ");
		}while(minInterval >= maxInterval);
		generateUserNameObj.generateUserName(userObj, minInterval,maxInterval);
		System.out.println(userObj.toString());
	}
	
	// Kész - Vizsgafelkészülés 1. feladat

}
