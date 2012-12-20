package de.frankea.EssenBesorger;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EssenBesorger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Essen essen = new Pizza();
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		
		Essensquelle pizzaService = appCtx.getBean("pizzaService", PizzaService.class);
		System.out.println(pizzaService.berechneKosten());
		//DateFormat.getd		

//		Essensquelle pizzaService = new PizzaService(essen, 2, 3, 4, 5);
//		System.out.println(pizzaService.berechneKosten());
		
	}

}
