package task03;

public class PcPart {

	private int id;
	private String name;
	private String accessionNumber;
	private String manufacturer;
	private String model;
	private int stockAmount;
	private int netPrice;
	@SuppressWarnings("unused")
	private boolean available;
	
	public PcPart(int id, String name, String accessionNumber, String manufacturer, String model, int stockAmount,
			int netPrice, boolean available) {
		this.id = id;
		this.name = name;
		this.accessionNumber = accessionNumber;
		this.manufacturer = manufacturer;
		this.model = model;
		this.stockAmount = stockAmount;
		this.netPrice = netPrice;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAccessionNumber() {
		return accessionNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public boolean isAvailable() {
		if (this.getStockAmount() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return this.getId() + ", "
				+this.getName() + ", "
					+this.getAccessionNumber() + ", "
						+this.getManufacturer() + ", "
							+this.getModel() + ", "
								+this.getStockAmount() + ", "
									+this.getNetPrice() + ", "
											+this.isAvailable();
	}
}
