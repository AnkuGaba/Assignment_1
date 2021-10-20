package com.ankush.nagarro.dto;

public class CaloriesDto {
	
	private String foodName;
	private double foodFat;
	private double foodCalories;
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodFat() {
		return foodFat;
	}
	public void setFoodFat(double foodFat) {
		this.foodFat = foodFat;
	}
	public double getFoodCalories() {
		return foodCalories;
	}
	public void setFoodCalories(double foodCalories) {
		this.foodCalories = foodCalories;
	}

}
