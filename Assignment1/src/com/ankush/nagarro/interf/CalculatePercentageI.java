package com.ankush.nagarro.interf;

import java.util.Map;

public interface CalculatePercentageI {

	double calPercent(double foodFat, double foodCalories);

	void printItem(String foodName, double calPercentage);

	void printList(Map<String, Double> map);

}
