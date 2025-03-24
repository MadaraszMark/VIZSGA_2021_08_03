package task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromConsole {
	
	public PcPart getPcPartFromConsole() {
		int id;
		String name;
		String accessionNumber;
		String manufacturer;
		String model;
		int stockAmount;
		int netPrice;
		boolean available;
		PcPart parts = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Kérem adja meg a PC alkatrész adatait!");
			System.out.print("Azonosító(egész szám): ");
			id = Integer.parseInt(br.readLine());
			System.out.print("Név(szöveg): ");
			name = br.readLine();
			System.out.print("Leltárszám(szöveg): ");
			accessionNumber = br.readLine();
			System.out.print("Gyártó(szöveg): ");
			manufacturer = br.readLine();
			System.out.print("Model(szöveg): ");
			model = br.readLine();
			System.out.print("Raktármennyiség(szám): ");
			stockAmount = Integer.parseInt(br.readLine());
			System.out.print("Nettó ár(tört szám): ");
			netPrice = Integer.parseInt(br.readLine());
			System.out.print("Elérhetőség(igaz = 1, hamis = 0): ");
			available = br.readLine().equalsIgnoreCase("1");
			
            parts = new PcPart(id, name, accessionNumber, manufacturer, model, stockAmount, netPrice, available);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parts;
		
	}

}
