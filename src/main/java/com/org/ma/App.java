package com.org.ma;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.ma.stock.StockException;

import com.org.ma.command.Command;
//import com.org.ma.command.impl.ComandImpl;
//import com.org.ma.stock.Stock;
//import com.org.ma.stock.impl.Stockimpl;
//import com.org.ma.stock.mock.StockMock;;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(value = "com.org.ma")
public class App {

	public static void main1(String[] args) throws StockException {
		/* dependency inside java code */
//		Command commandComponent = new ComandImpl();
//		Stock stockComponent = new Stockimpl();
//		Stock stockMockComponent = new StockMock();
//		commandComponent.setStock(stockMockComponent);
//
//		commandComponent.doSomthings();
	}

	public static void main2(String[] args) throws StockException {
		/* dependency within xontext.xml */

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
			Command commandComponent = context.getBean(Command.class);
			// System.out.println(commandComponent);
			commandComponent.doSomthings();
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new StockException(e.getMessage());
		}
	}

	public static void main(String[] args) throws StockException {
		/* dependency within annotations */

		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
			Command commandComponent = context.getBean(Command.class);
			// System.out.println(commandComponent);
			commandComponent.doSomthings();
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new StockException(e.getMessage());
		}
	}
}
