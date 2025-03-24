package task03;

import java.util.ArrayList;
import java.util.List;

public class TaskSolution {
	
	List<PcPart> partList = new ArrayList<PcPart>();
	
	public void fillPcPartList() {
        ReadDataFromConsole readDataObj = new ReadDataFromConsole();
        for(int i = 0; i < 3; i++) {
        	partList.add(readDataObj.getPcPartFromConsole());
        }
    }
	
	public void printAllPcParts() {
		for(PcPart part : partList) {
            System.out.println(part);}
	}
	
	public void getMostExpensivePcPartDetails() {
		int max = 0;
		for (PcPart pcPart : partList) {
			if (pcPart.getNetPrice() > max) {
				max = pcPart.getNetPrice();
			}
		}
		for (PcPart pcPart : partList) {
			if (pcPart.getNetPrice() == max) {
				System.out.println(pcPart.toString());
			}
		}	
	}

}
