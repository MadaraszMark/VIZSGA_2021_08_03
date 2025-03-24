package task02;

public class App {

	public static void main(String[] args) {
		// Bicycle bicycleObj = new Bicycle(1, "KTM", "M-111", 150000, true);
		// bicycleObj.setSaleNetPrice(20);
		// System.out.println(bicycleObj.toString());
		
		Bicycle bicycleObj2 = new ReadDataFromConsole().getBicycleData();
		Double percent = new ReadDataFromConsole().getSalePercentage();
		bicycleObj2.setSaleNetPrice(percent);
		System.out.println(bicycleObj2.toString());
	}
	
	// Kész - Vizsgafelkészülés 2. feladat
}
