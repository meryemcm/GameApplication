package Entities;

public class Game {
	
	

	private int id;
	private String gameName; 
	private double price;
	private String description;
	
	
	public Game(int id, String gameName, double price, String description) {
		super();
		this.setId(id);
		this.setGameName(gameName);
		this.setPrice(price);
		this.setDescription(description);
	}


	public Game() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
