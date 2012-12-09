package de.frankea.primfaktorenzerleger;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class PrimfaktorenZerlegerTest {

	List<Integer> istErgebnis;
	List<Integer> sollErgebnis;
	
	@Before
	public void before() {
		istErgebnis = new ArrayList<Integer>();
		sollErgebnis = new ArrayList<Integer>();
	}
	
	@Test
	public void testFirst() {
		sollErgebnis.add(1);
		istErgebnis = Primfaktorenzerleger.zerlegeInFaktoren(1);
		Assert.assertEquals(sollErgebnis, istErgebnis);
	}
	
	@Test
	public void testSecond() {
		sollErgebnis.add(1);
		sollErgebnis.add(2);
		istErgebnis = Primfaktorenzerleger.zerlegeInFaktoren(2);
		Assert.assertEquals(sollErgebnis, istErgebnis);
	}
	
	@Test
	public void testFuenfzehn() {
		sollErgebnis.add(1);
		sollErgebnis.add(3);
		sollErgebnis.add(5);
		istErgebnis = Primfaktorenzerleger.zerlegeInFaktoren(15);
		Assert.assertEquals(sollErgebnis, istErgebnis);
	}
	
	@Test
	public void testZweihundertEinunddreissig() {
		sollErgebnis.add(1);
		sollErgebnis.add(3);
		sollErgebnis.add(7);
		sollErgebnis.add(11);
		istErgebnis = Primfaktorenzerleger.zerlegeInFaktoren(231);
		Assert.assertEquals(sollErgebnis, istErgebnis);
	}
	
	@Test
	public void testFaktorEinundsiebzig() {
		sollErgebnis.add(1);
		sollErgebnis.add(3);
		sollErgebnis.add(7);
		sollErgebnis.add(11);
		sollErgebnis.add(71);
		istErgebnis = Primfaktorenzerleger.zerlegeInFaktoren(16401);
		Assert.assertEquals(sollErgebnis, istErgebnis);
	}
	
	
}
