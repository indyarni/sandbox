package de.frankea.EssenBesorger;

import org.junit.Assert;
import org.junit.Test;

public class PizzaServiceTest {

	private static final Integer DAUER_PIZZA = Integer.valueOf(17);
	private static final Integer KOSTEN_PIZZA = Integer.valueOf(112);
	private Essen pizza = new Pizza();
	private Essensquelle getestetesObjekt = new PizzaService(pizza, 6, 7, 8, 9);
	
	@Test
	public void testBerechneKosten() {
		Assert.assertEquals(KOSTEN_PIZZA, getestetesObjekt.berechneKosten());
	}

	@Test
	public void testBerechneDauer() {
		Assert.assertEquals(DAUER_PIZZA, getestetesObjekt.berechneDauer());
	}

}
