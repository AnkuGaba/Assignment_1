package com.ankush.nagarro.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.ankush.nagarro.dto.CaloriesDto;
import com.ankush.nagarro.exception.CustomException;
import com.ankush.nagarro.interfImpl.CalculatePercentageImpl;

public class CaloriesController {

	Scanner scan = new Scanner(System.in);

	CalculatePercentageImpl cp = new CalculatePercentageImpl();
	Map<String, Double> map = new HashMap<String, Double>();

	public void scanInput() throws CustomException {
		CaloriesDto cd = new CaloriesDto();

		System.out.println("Enter food name");
		cd.setFoodName(scan.next());
		System.out.println("Enter food fat");
		cd.setFoodFat(scan.nextDouble());
		System.out.println("Enter food calories");
		cd.setFoodCalories(scan.nextDouble());
		if (cd.getFoodCalories() <= 0) {
			throw new CustomException("calories can't be equal or less than zero");
		}
		String foodName = cd.getFoodName();
		double foodFat = cd.getFoodFat();
		double foodCalories = cd.getFoodCalories();
		double calPercentage = cp.calPercent(foodFat, foodCalories);
		cp.printItem(foodName, calPercentage);
		if (calPercentage <= 30) {
			map.put(foodName, calPercentage);
		}
	}

	public void showList() {
		cp.printList(map);
	}

}
