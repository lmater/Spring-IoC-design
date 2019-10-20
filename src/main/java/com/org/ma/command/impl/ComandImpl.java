package com.org.ma.command.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.ma.command.Command;
import com.org.ma.stock.Stock;
import com.org.ma.stock.StockException;

@Component
public class ComandImpl implements Command {

	@Autowired
	private Stock stock;

	public ComandImpl() {
		System.out.println("on instantie un composant de  ComandImpl");
		// TODO Auto-generated constructor stub
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		System.out.println("appel ComandImpl.setStock");
		this.stock = stock;
	}

	public void setNimporte(int a) {
		System.out.println("appel ComandImpl.setNimporte");

	}

	public void doSomthings() {
		try {
			if (stock.isArticleAvailable(1, 3)) {

				stock.removeArticleInstances(1, 3);
			} else {
				System.out.println("In ComandImpl.isArticleAvailable,  pas possible");

			}
		} catch (StockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
