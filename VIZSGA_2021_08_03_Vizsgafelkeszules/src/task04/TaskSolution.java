package task04;

import java.util.ArrayList;
import java.util.List;

public class TaskSolution {
	
	List<Pizza> pizzas = new ArrayList<Pizza>();
	
    public void fillPizzaList() {
        ReadDataFromFile readData = new ReadDataFromFile();
        pizzas = readData.getDataFromCsv();
    }
    
    public void printAllPizzaData() {
    	System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", "Azonosító", "Név", "nettó ár", "Eladott db", "Akció");
		for (Pizza pizza : pizzas) {
            System.out.println(pizza.toStringDivide());
        }
	}
    
    public void getLeastExpensivePizza() {
    	int min = pizzas.get(0).getNetPrice();
    	for (Pizza pizza : pizzas) {
			if (pizza.getNetPrice() < min) {
				min = pizza.getNetPrice();
			}
		}
    	for (Pizza pizza : pizzas) {
			if (pizza.getNetPrice() == min) {
				System.out.println(pizza.toStringDivide());
			}
		}
    }

}
