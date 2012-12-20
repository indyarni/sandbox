package de.frankea.EssenBesorger;

public class Restaurant implements Essensquelle {

	private Integer preis;
	private Integer trinkgeld;
	private Integer fahrtzeit;
	private Integer wartezeit;
	private Integer essenszeit;
	
	
	
	public Restaurant(Integer preis, Integer trinkgeld, Integer fahrtzeit,
			Integer wartezeit, Integer essenszeit) {
		super();
		this.preis = preis;
		this.trinkgeld = trinkgeld;
		this.fahrtzeit = fahrtzeit;
		this.wartezeit = wartezeit;
		this.essenszeit = essenszeit;
	}



	/* (non-Javadoc)
	 * @see Essensquelle#berechneKosten()
	 */
	@Override
	public Integer berechneKosten() {
		return preis+trinkgeld;		
	}



	/* (non-Javadoc)
	 * @see Essensquelle#berechneDauer()
	 */
	@Override
	public Integer berechneDauer() {
		return fahrtzeit+wartezeit+essenszeit;
	}
	
}
