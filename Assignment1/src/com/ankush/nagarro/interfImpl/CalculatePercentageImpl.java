package com.ankush.nagarro.interfImpl;

import java.util.Map;
import java.util.TreeMap;

import com.ankush.nagarro.interf.CalculatePercentageI;

public class CalculatePercentageImpl implements CalculatePercentageI {

	String foodName;
	double foodFat;
	double foodCalories;
	double percent;

	@Override
	public double calPercent(double foodFat, double foodCalories) {
		percent = ((9 * foodFat) / foodCalories) * 100;
		return percent;
	}

	@Override
	public void printItem(String foodName, double calPercentage) {
		if (calPercentage <= 30) {
			System.out.println("Percentage of calories present in " + foodName + " item is: " + calPercentage);
			System.out.println("The food item " + foodName + " is Heart Healthy");
		} else {
			System.out.println("Percentage of calories present in " + foodName + " item is: " + calPercentage);
			System.out.println("The food item " + foodName + " is not Heart Healthy");
		}
	}

	public void printList(Map<String, Double> map) {
			TreeMap<String, Double> sorted = new TreeMap<>();
			sorted.putAll(map);
			for (Map.Entry<String, Double> m : sorted.entrySet()) {
				System.out.println(m.getKey() + "	    " + m.getValue());
			}
	}

}
