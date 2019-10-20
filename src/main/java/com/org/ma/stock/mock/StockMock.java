package com.org.ma.stock.mock;

import org.springframework.stereotype.Component;

import com.org.ma.stock.Stock;
import com.org.ma.stock.StockException;

@Component
public class StockMock implements Stock {

	public StockMock() {
		System.out.println("on instantie un bouchon pour le mock");
		// TODO Auto-generated constructor stub
	}

	public boolean isArticleAvailable(int idArticle, int quantity) {
		System.out.println("IN StockMock.isArticleAvailable");
		return true;
	}

	public void addArticleInstances(int idArticle, int quantity) {
		System.out.println("IN StockMock.addArticleInstances");

	}

	public void removeArticleInstances(int idArticle, int quantity) throws StockException {
		System.out.println("IN StockMock.removeArticleInstances");

	}

}
