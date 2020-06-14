package taxstrategy;

/**
 * Une interface qui represente une abstraction pour la strategie de calculer les taxes selon 
 * une categorie de produit suivant le design pattern Strategy.
 * 
 * @author aymane
 * @since Juin 2020
 */
public interface TaxStrategy {
	
	/**
	 * Calculer la taxe à ajouter en prenant en consideration si le produit est 
	 * importé ou pas
	 * 
	 * @param boolean isImported
	 * @return la taxe à ajouter
	 */
    double getAppropriateTax(boolean isImported);

}
