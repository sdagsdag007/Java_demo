package com.neusoft.pojo;

public class FoodType {
	private int id;
	private String typeName;
	private Food food;
	public FoodType() {
		
	}
	public FoodType(int id, String typeName, Food food) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.food = food;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "FoodType [id=" + id + ", typeName=" + typeName + ", food=" + food + "]";
	}
	
}
