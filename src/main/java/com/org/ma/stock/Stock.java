package com.org.ma.stock;

public interface Stock {

	public boolean isArticleAvailable(int idArticle, int quantity);

	public void addArticleInstances(int idArticle, int quantity);

	public void removeArticleInstances(int idArticle, int quantity) throws StockException;
}
