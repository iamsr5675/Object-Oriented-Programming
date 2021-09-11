package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

public class StockOperations {
	
	Scanner sc = new Scanner(System.in);

	public Stock addStock() {
		Stock stock = new Stock();
		
		System.out.println("Enter the Stock name: ");
		stock.setStockName(sc.next());
		
		System.out.println("Enter the price of Stock share: ");
		stock.setPrice(sc.nextInt());
		
		System.out.println("Enter the number of shares: ");
		stock.setNumberOfShare(sc.nextInt());
		System.out.println(stock);
		return stock;
	}

	public void calculateEachStockValue(Stock[] stockArray) {
		for(int eachStock = 0; eachStock < stockArray.length; eachStock++)
		{
			if(stockArray[eachStock] != null)
			{
				Stock stock = stockArray[eachStock];
				int value = stock.getPrice() * stock.getNumberOfShare();
				System.out.println("The value of " + stock.getStockName() + " is : " +value);
			}
		}
		
	}

	public void calculateTotalValue(Stock[] stockArray) {
		int total = 0;
		for(int eachStock = 0; eachStock < stockArray.length; eachStock++) {
			if(stockArray[eachStock] != null) {
				Stock stock = stockArray[eachStock];
				total = total + (stock.getPrice() * stock.getNumberOfShare());
			}
		}
		System.out.println("Total value of Stock is: " +total);
	}

}

