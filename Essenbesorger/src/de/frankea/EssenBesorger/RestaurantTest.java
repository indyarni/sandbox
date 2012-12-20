package de.frankea.EssenBesorger;


import org.junit.Assert;
import org.junit.Test;


public class RestaurantTest {
	
	private Essensquelle getestetesObjekt = new Restaurant(30, 3, 35, 20, 30);

	@Test
	public void testBerechneKosten() {
		Assert.assertEquals(Integer.valueOf(33), getestetesObjekt.berechneKosten());
	}
	
	@Test
	public void testBerechneZeitaufwand() {
		Assert.assertEquals(Integer.valueOf(85), getestetesObjekt.berechneDauer());
	}
}
