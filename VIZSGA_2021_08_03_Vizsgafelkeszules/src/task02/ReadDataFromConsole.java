package task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromConsole {
	
	public Bicycle getBicycleData() {
		int id;
		String manufacturer;
		String model;
		double netPrice;
		boolean available;
		Bicycle bicycleObj = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Kérem adja meg a kerékpár adatait!");
			System.out.print("\nAzonosító (egész szám): ");
			id = Integer.parseInt(br.readLine());
			System.out.print("Gyártó (szöveg): ");
			manufacturer = br.readLine();
			System.out.print("Model (szöveg): ");
			model = br.readLine();
			System.out.print("Nettó ár (tört szám): ");
			netPrice = Double.parseDouble(br.readLine());
			System.out.print("Elérhetőség (igaz = 1 / hamis = 0): ");
			available = br.readLine().equalsIgnoreCase("1");
			
			bicycleObj = new Bicycle(id, manufacturer, model, netPrice, available);
			
		} catch (NumberFormatException e) {
			System.err.println("Hiba!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bicycleObj;
	}
	
	public double getSalePercentage() {
		double percent = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Kérem adja meg az akció százalékos értékét: ");
			percent = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println("Hiba!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return percent;
	}

}
