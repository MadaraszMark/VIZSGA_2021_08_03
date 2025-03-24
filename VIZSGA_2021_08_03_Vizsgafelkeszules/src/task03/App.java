package task03;

public class App {

	public static void main(String[] args) {
		PcPart pcPartObject = new PcPart(
				1,
				"ASUS alaplap R400",
				"TGO-120401",
				"ASUS",
				"R400",
				30,
				35000,
				true
		);
		
		TaskSolution taskSolutionObj = new TaskSolution();
		taskSolutionObj.fillPcPartList();
		System.out.println("\nAdatok:");
		taskSolutionObj.printAllPcParts();
		System.out.println("\nA legdrágább alkatrész: ");
		taskSolutionObj.getMostExpensivePcPartDetails();
		
		// Kész - Vizsgafelkészülés 3. feladat

		
	}

}
