package objects;

public class product {
	private String ID;
	private float price;
	
	public product(String iD, float price) {
		super();
		this.ID = iD;
		this.price = price;
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [ID=" + this.ID + ", price=" + this.price + "]";
	}

	
}

