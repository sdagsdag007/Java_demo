package com.neusoft.pojo;

public class Food {
	private int id;
	private String foodName;
	private String feature;
	private String material;
	private int price;
	private int type;
	private String picture;
	private int hits;
	private int comment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", foodName=" + foodName + ", feature=" + feature + ", material=" + material
				+ ", price=" + price + ", type=" + type + ", picture=" + picture + ", hits=" + hits + ", comment="
				+ comment + "]";
	}
	
	
	
}
