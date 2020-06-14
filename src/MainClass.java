import java.text.NumberFormat;
import java.util.ArrayList;
import taxstrategy.BookTax;
import taxstrategy.FoodMedicineTax;
import taxstrategy.OtherProductTax;

public class MainClass {
	
	public static void main(String argd[]) {
		
		/**
		 * Utilisation de l'objet mNumberFormat de type NumberFormat pour afficher 
		 * les résultats selon le format souhaité (2 numéro après la virgule)
		 */
		NumberFormat mNumberFormat = NumberFormat.getInstance();
		mNumberFormat.setMaximumFractionDigits(2);
		
		/** Input 1 : */
		
		ArrayList<Product> products1 = new ArrayList<>();
		Product p1 = new Product(12.49, 2, false);
		Product p2 = new Product(14.99, 1, false);
		Product p3 = new Product(0.85, 3, false);
		
		products1.add(p1);
		products1.add(p2);
		products1.add(p3);
		
		/** Input 2 : */
		
		ArrayList<Product> products2 = new ArrayList<>();
		Product p21 = new Product(10.0, 2, true);
		Product p22 = new Product(47.50, 3, true);
		
		products2.add(p21);
		products2.add(p22);
		
		/** Input 3 : */
		
		ArrayList<Product> products3 = new ArrayList<>();
		Product p31 = new Product(27.99, 2, true);
		Product p32 = new Product(18.99, 1, false);
		Product p33 = new Product(9.75, 3, false);
		Product p34 = new Product(11.25, 2, true);
		
		products3.add(p31);
		products3.add(p32);
		products3.add(p33);
		products3.add(p34);
		
		System.out.println("#### Output 1\n");
		
		System.out.println("* 2 livres à 12.49€ : " + mNumberFormat.format(p1.calculatePriceAfterTax((new BookTax()))) + "€ TTC");
		System.out.println("* 1 CD musical à 14.99€ : " + mNumberFormat.format(p2.calculatePriceAfterTax((new OtherProductTax()))) + "€ TTC");
		System.out.println("* 3 barres de chocolat à 0.85€ : " + mNumberFormat.format(p3.calculatePriceAfterTax(new FoodMedicineTax())) + "€ TTC \n");
		
		System.out.println("Montant des taxes : " + mNumberFormat.format(TaxUtils.getTotalTax(products1)) + "€");
		System.out.println("Montant des taxes : " + mNumberFormat.format(TaxUtils.getTotalPricesAfterTax(products1)) + "€");
		
		System.out.println("\n#### Output 2\n");
		
		System.out.println("* 2 boîtes de chocolats importée à 10€ : " + mNumberFormat.format(p21.calculatePriceAfterTax((new FoodMedicineTax()))) + "€ TTC");
		System.out.println("* 3 flacons de parfum importé à 47.50€ : " + mNumberFormat.format(p22.calculatePriceAfterTax((new OtherProductTax()))) + "€ TTC \n");
		
		System.out.println("Montant des taxes : " + mNumberFormat.format(TaxUtils.getTotalTax(products2)) + "€");
		System.out.println("Montant des taxes : " + mNumberFormat.format(TaxUtils.getTotalPricesAfterTax(products2)) + "€");
		
		System.out.println("\n#### Output 3\n");
		
		System.out.println("* 2 flacons de parfum importé à 27.99€ : " + mNumberFormat.format(p31.calculatePriceAfterTax((new OtherProductTax()))) + "€ TTC");
		System.out.println("* 1 flacon de parfum à 18.99€ : " + mNumberFormat.format(p32.calculatePriceAfterTax((new OtherProductTax()))) + "€ TTC");
		System.out.println("* 3 boîtes de pilules contre la migraine à 9.75€ : " + mNumberFormat.format(p33.calculatePriceAfterTax((new FoodMedicineTax()))) + "€ TTC");
		System.out.println("* 2 boîtes de chocolats importés à 11.25€ : " + mNumberFormat.format(p34.calculatePriceAfterTax((new FoodMedicineTax()))) + "€ TTC \n");
		
		System.out.println("Montant des taxes : " + mNumberFormat.format(TaxUtils.getTotalTax(products3)) + "€");
		System.out.println("Montant des taxes : " + mNumberFormat.format(TaxUtils.getTotalPricesAfterTax(products3)) + "€");
		
	}

}
