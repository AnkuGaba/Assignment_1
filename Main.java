package com.ankush.nagarro.main;

import java.util.Scanner;

import com.ankush.nagarro.controller.CaloriesController;
import com.ankush.nagarro.exception.CustomException;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CaloriesController cc = new CaloriesController();
		try {
			String nextItem;
			do {
				cc.scanInput();
				System.out.println("Do you have another item? (Enter y for yes):");
				nextItem = scan.next();
			} while (nextItem.equals("y") || nextItem.equals("Y"));
		} catch (CustomException e) {
			System.out.println("Exception occurs!");
			System.err.println(e);
			System.out.println("Please re-enter the correct food item details again...");
		} catch (Exception e) {
			System.out.println("Invalid data type of values.");
		} finally {
			System.out.println("The food items which are Heath Healthy from given input is listed below:");
			System.out.println("Food Name " + " " + " Food Calories Percentage");
			cc.showList();
		}
	}

}
