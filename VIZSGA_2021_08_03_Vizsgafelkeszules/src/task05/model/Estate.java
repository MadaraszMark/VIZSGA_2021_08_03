package task05.model;

public class Estate {
	
	private int id;
	private String name;
	private int size;
	private int roomCount;
	private String addressCity;
	private String addressPostalNumber;
	private String address;
	private int price;
	private int categoryId;
	private boolean sale;
	private boolean status;
	
	public Estate(int id, String name, int size, int roomCount, String addressCity, String addressPostalNumber,
			String address, int price, int categoryId, boolean sale, boolean status) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.roomCount = roomCount;
		this.addressCity = addressCity;
		this.addressPostalNumber = addressPostalNumber;
		this.address = address;
		this.price = price;
		this.categoryId = categoryId;
		this.sale = sale;
		this.status = status;
	}
	
	public Estate(String name, int size, int roomCount, String addressCity, String addressPostalNumber,
			String address, int price, int categoryId, boolean sale, boolean status) {
		this.name = name;
		this.size = size;
		this.roomCount = roomCount;
		this.addressCity = addressCity;
		this.addressPostalNumber = addressPostalNumber;
		this.address = address;
		this.price = price;
		this.categoryId = categoryId;
		this.sale = sale;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public String getAddressPostalNumber() {
		return addressPostalNumber;
	}

	public String getAddress() {
		return address;
	}

	public int getPrice() {
		return price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public boolean isSale() {
		return sale;
	}

	public boolean isStatus() {
		return status;
	}
	
	public String getSaleText() {
		if (this.sale) {
			return "Akciós";
		} else {
			return "Nem Akciós";
		}
	}
	
	public String getStatusText() {
		if (this.status) {
			return "Aktív";
		} else {
			return "Inaktív";
		}
	}
	
}
