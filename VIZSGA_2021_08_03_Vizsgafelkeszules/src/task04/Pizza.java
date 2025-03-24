package task04;

public class Pizza {

	private String id;
	private String name;
	private int netPrice;
	private int soldNumber;
	private boolean sale;
	
	public Pizza(String id, String name, int netPrice, int soldNumber, boolean sale) {
		this.id = id;
		this.name = name;
		this.netPrice = netPrice;
		this.soldNumber = soldNumber;
		this.sale = sale;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNetPrice() {
		return netPrice;
	}
	public int getSoldNumber() {
		return soldNumber;
	}
	public boolean isSale() {
		return sale;
	}
	
	public String getIsSaleText() {
		return this.isSale() ? "Akciós" : "Nem akciós";
	}
	
	public boolean isIdLenghtValid() {
		if (this.id.length()==9) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", netPrice=" + netPrice + ", soldNumber=" + soldNumber
				+ ", sale=" + sale + "]";
	}
	
	public String toStringDivide() {
		return String.format("%-15s %-15s %-15s %-15s %-15s", id, name, netPrice + " Ft", soldNumber + " db", getIsSaleText());
	}
	
	
}
