package com.org.ma.command;

import com.org.ma.stock.Stock;

public interface Command {
	public Stock getStock();

	public void setStock(Stock stock);

	public void doSomthings();
}
