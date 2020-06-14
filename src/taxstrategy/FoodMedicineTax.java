package taxstrategy;

/**
 * Une implementation de l'interface TaxStrategy pour les produits sans taxes 
 * 
 * @author aymane
 * @since juin 2020 
 */
public class FoodMedicineTax implements TaxStrategy {
	
	public FoodMedicineTax() {
		
	}

	@Override
	public double getAppropriateTax(boolean isImported) {
		return isImported ? 0.05 : 0.0;
	}

}
