import java.util.ArrayList;

/**
 * Une classe qui servira les différentes opérations possibles 
 * sur les taxes des produits
 *  
 * @author aymane
 * @since juin 2020
 */
public class TaxUtils {
	
	
	public static double getTotalTax(ArrayList<Product> products) {
		return products.stream().mapToDouble(p -> p.getProductTax()).sum();
	}
	
	public static double getTotalPricesAfterTax(ArrayList<Product> products) {
		return products.stream().mapToDouble(p -> p.getPriceAfterTax()).sum();
	}
	
}
