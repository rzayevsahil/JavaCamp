package Entities;

import Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private String category;
	private double price;
	Campaign campaign;

	public Game() {

	}

	public Game(int id, String name, String category, double price, Campaign campaign) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.campaign = campaign;
	}
	
	public Game(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
