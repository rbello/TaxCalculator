package taxstrategy;

/**
 * Une implementation de l'interface TaxStrategy pour les produits livres 
 * dont le taxe est fixé à 10% 
 * 
 * @author aymane
 * @since juin 2020 
 */
public class BookTax implements TaxStrategy {
	
	public BookTax() {
		
	}

	@Override
	public double getAppropriateTax(boolean isImported) {
		return isImported ? 0.15 : 0.1;
	}
	
}
