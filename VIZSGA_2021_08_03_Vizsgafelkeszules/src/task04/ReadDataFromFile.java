package task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {
	
	public List<Pizza> getDataFromCsv() {
		List<Pizza> pizzas = new ArrayList<Pizza>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("task_04_data/pizzeria.csv"), "UTF-8"));
			String header = br.readLine();
			while(br.ready()) {
				String row = br.readLine();
                pizzas.add(getDataFromRow(row));
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("A kódolás hibás!");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Nem található a fájl!");
		} catch (IOException e) {
			System.out.println("I/O hiba történt!");
			//e.printStackTrace();
		}
		return pizzas;
	}
	
	public Pizza getDataFromRow(String row) {
		String[] rowData = row.split(";");
		Boolean saleTemp = rowData[4].equals("1");
        return new Pizza(
                rowData[0],
                rowData[1],
                Integer.parseInt(rowData[2]),
                Integer.parseInt(rowData[3]),
                saleTemp
        );
	}

}
