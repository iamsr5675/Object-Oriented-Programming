package com.bridgelabz.stockaccountmanagement.view;

import com.bridgelabz.stockaccountmanagement.model.Stock;

public interface StockOperationsInterface {
	public Stock addStock();
	public void calculateEachStockValue(Stock[] listOfStock);

}
