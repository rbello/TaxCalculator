package taxstrategy;

/**
 * Une implementation de l'interface TaxStrategy pour autres produits 
 * dont le taxe est fixé à 20% 
 * 
 * @author aymane
 * @since juin 2020 
 */
public class OtherProductTax implements TaxStrategy {
	
	public OtherProductTax() {
		
	}

	@Override
	public double getAppropriateTax(boolean isImported) {
		return isImported ? 0.25 : 0.2;
	}
	
}
