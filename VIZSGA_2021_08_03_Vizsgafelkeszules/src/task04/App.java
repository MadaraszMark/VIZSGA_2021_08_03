package task04;

public class App {

	public static void main(String[] args) {
		//Pizza pizzaObj = new Pizza("DRP-12345", "Füstölt sajtos", 3500, 40, false);
		//System.out.println(pizzaObj.isIdLenghtValid());
		
		TaskSolution taskSolutionObj = new TaskSolution();
		taskSolutionObj.fillPizzaList();
		taskSolutionObj.printAllPizzaData();
		System.out.println("\nA legolcsóbb pizza(k): ");
		taskSolutionObj.getLeastExpensivePizza();
	}
	
	// Kész - Vizsgafelkészülés 4. feladat

}
