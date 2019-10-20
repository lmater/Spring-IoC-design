package com.org.ma.stock;

import java.io.Serializable;

public class StockException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7694349768546585784L;

	public StockException() {
		super("stock not permit this action");
	};

	public StockException(String message) {
		super(message);
	};

	public StockException(Throwable cause) {
		super(cause);
	};

	public StockException(String message, Throwable cause) {
		super(message, cause);
	};

}
