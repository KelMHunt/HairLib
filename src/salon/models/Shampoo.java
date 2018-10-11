package salon.models;

public class Shampoo 
{
	private int id;
	private float price;
	private String brand;
	private String scent;
	
	public Shampoo() 
	{
		this.id = 0;
		this.price = 0.0f;
		this.brand = "";
		this.scent = "";
	}
	public Shampoo(int id, float price, String brand, String scent) 
	{
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
		this.scent = scent;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}
	@Override
	public String toString() {
		return "Shampoo [id=" + id + ", price=" + price + ", brand=" + brand
				+ ", scent=" + scent + "]";
	}
	
	
}
