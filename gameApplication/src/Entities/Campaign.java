package Entities;

public class Campaign {
	

	private int id;
	private String name;
	private double discountRate;
	
	public Campaign(int id, String name, double discountRate) {
		super();
		this.setId(id);
		this.setName(name);
		this.setDiscountRate(discountRate);
	}

	public Campaign() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
