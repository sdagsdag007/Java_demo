package com.neusoft.pojo;

public class UserShopCar {
	private int id;
	private int userId;
	private int foodId;
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserShopCar [id=" + id + ", userId=" + userId + ", foodId=" + foodId + ", user=" + user + "]";
	}
}
