package com.org.ma.stock.impl;

import java.util.Hashtable;

import com.org.ma.stock.Stock;
import com.org.ma.stock.StockException;

public class Stockimpl implements Stock {

	private Hashtable<Integer, Integer> stock = new Hashtable<Integer, Integer>();

	public Stockimpl() {
		System.out.println("on instantie un composant de  Stockimpl");

		stock.put(1, 5);
		stock.put(2, 10);
		stock.put(3, 15);
	}

	public boolean isArticleAvailable(int idArticle, int quantity) {
		System.out.println("In stockImpl.isArticleAvailable");
		return stock.get(idArticle) >= quantity;
	}

	public void addArticleInstances(int idArticle, int quantity) {
		System.out.println("In stockImpl.addArticleInstances");
		stock.put(idArticle, stock.get(idArticle) + quantity);

	}

	public void removeArticleInstances(int idArticle, int quantity) throws StockException {
		System.out.println("In stockImpl.removeArticleInstances");
		if (stock.get(idArticle) < quantity) {
			throw new StockException(String.format("article %d not available in quantity %d", idArticle, quantity));
		}
		stock.put(idArticle, stock.get(idArticle) - quantity);
	}

}
