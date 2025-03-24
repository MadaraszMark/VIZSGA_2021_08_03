package task02;

public class Bicycle {

	private int id;
	private String manufacturer;
	private String model;
	private double netPrice;
	private boolean available;
	
	public Bicycle(int id, String manufacturer, String model, double netPrice, boolean available) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.netPrice = netPrice;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public void setSaleNetPrice(double percent) {
		this.netPrice -= this.netPrice*percent/100; 
	}
	
	public String getIsAvailableTxt() {
        return this.available? "Elérhető" : "Nem elérhető";
    }
	
	public String toString(){
		return "Kerékpár adatai: "
				+this.getId() + ", "
				+this.getManufacturer() + ", "
				+this.getModel() + ", "
				+this.getNetPrice()+ ", "
				+this.getIsAvailableTxt();
	}
}
