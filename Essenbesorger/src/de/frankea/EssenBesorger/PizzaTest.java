package de.frankea.EssenBesorger;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTest {

	private static final Integer PIZZA_KOSTEN = Integer.valueOf(99);

	@Test
	public void testGetKosten() {
		Pizza pizza = new Pizza();
		Assert.assertEquals(PIZZA_KOSTEN, pizza.getKosten());
	}

}
