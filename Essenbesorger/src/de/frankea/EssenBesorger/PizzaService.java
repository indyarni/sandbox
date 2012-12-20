package de.frankea.EssenBesorger;

public class PizzaService implements Essensquelle {
	
	private Essen essen;
	private Integer trinkgeld;
	private Integer lieferAufschlag;
	private Integer backzeit;
	private Integer lieferzeit;

	
	
	/**
	 * @param preis How much, man?
	 * @param trinkgeld Get yourself a cup of coffee and a donut. 
	 * @param lieferAufschlag
	 * @param backzeit
	 * @param lieferzeit
	 */
	public PizzaService(Essen essen, Integer trinkgeld,
			Integer lieferAufschlag, Integer backzeit, Integer lieferzeit) {
		super();
		this.essen = essen;
		this.trinkgeld = trinkgeld;
		this.lieferAufschlag = lieferAufschlag;
		this.backzeit = backzeit;
		this.lieferzeit = lieferzeit;
	}

	@Override
	public Integer berechneKosten() {
		return essen.getKosten()+trinkgeld+lieferAufschlag;
	}

	@Override
	public Integer berechneDauer() {
		return backzeit+lieferzeit;
	}

}
