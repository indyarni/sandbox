package de.frankea.primfaktorenzerleger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Primfaktorenzerleger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie die Zahl ein, die Sie in Primfaktoren zerlegen wollen!");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer ausgangsWert = 0;
		try {
			ausgangsWert = Integer.valueOf(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		for(Integer faktor : zerlegeInFaktoren(ausgangsWert)) {
			System.out.println(faktor);
		}

	}

	/**
	 * @param ausgangsWert Der Wert, der in Primfaktoren zerlegt werden soll.
	 * @return Eine Liste der Primfaktoren.
	 */
	public static List<Integer> zerlegeInFaktoren(Integer ausgangsWert) {
		List<Integer> ergebnis = new ArrayList<Integer>();				
		int aktuellePrimzahl = 1;
		
		while(aktuellePrimzahl <= ausgangsWert) {
			if(ausgangsWert%aktuellePrimzahl==0) {
				ergebnis.add(aktuellePrimzahl);
			}
			aktuellePrimzahl = ermittleNaechstePrimzahl(aktuellePrimzahl);			
		}
		
		return ergebnis;
	}

	private static int ermittleNaechstePrimzahl(int aktuellePrimzahl) {		
		while(true) {				
			aktuellePrimzahl++;
			if(istPrimzahl(aktuellePrimzahl)) {
				break;
			}
		}
		return aktuellePrimzahl;
	}

	private static boolean istPrimzahl(int aktuellePrimzahl) {
		boolean istPrimzahl;
		istPrimzahl = true;
		int zaehler = 2;
		while(zaehler<aktuellePrimzahl) {
			if(aktuellePrimzahl%zaehler==0) {
				istPrimzahl = false;
				break;
			}
			zaehler++;
		}
		return istPrimzahl;
	}

}
