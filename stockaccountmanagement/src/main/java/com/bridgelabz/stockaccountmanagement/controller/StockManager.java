package com.bridgelabz.stockaccountmanagement.controller;

import java.util.Scanner;

import com.bridgelabz.stockaccountmanagement.model.Stock;
import com.bridgelabz.stockaccountmanagement.model.StockOperations;

public class StockManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stock[] stockArray = new Stock[3];
		int arrayIndex = 0;
		Stock stockOb = new Stock();
		StockOperations operationOb = new StockOperations();
		
		do {
			System.out.println("1 : Add Stock\n2 : Value Of each inventory\n3 : Total Value Of Stock");
			int userChoice = sc.nextInt();
			switch(userChoice) {
			case 1:
				stockOb = operationOb.addStock();
				stockArray[arrayIndex] = stockOb;
				arrayIndex++;
				break;
				
			case 2:
				operationOb.calculateEachStockValue(stockArray);
				break;
				
			case 3:
				operationOb.calculateTotalValue(stockArray);
				break;
			}
			System.out.println("If you want to perform more Operations enter true");
		}
		while(sc.nextBoolean());
		sc.close();
	}

}
