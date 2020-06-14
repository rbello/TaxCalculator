import taxstrategy.TaxStrategy;

public class Product {
	
	private double priceBeforeTax; 
	private int quantity; 
	private boolean isImported;
	private double productTax;
	private double priceAfterTax;
		
	public Product(double priceBeforeTax, int quantity, boolean isImported) {
		this.priceBeforeTax = priceBeforeTax;
		this.quantity = quantity;
		this.isImported = isImported;
	}

	public double getPriceBeforeTax() {
		return priceBeforeTax;
	}

	public void setPriceBeforeTax(double priceBeforeTax) {
		this.priceBeforeTax = priceBeforeTax;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	public double getProductTax() {
		return productTax;
	}

	public void setProductTax(double productTax) {
		this.productTax = productTax;
	}

	public double getPriceAfterTax() {
		return priceAfterTax;
	}

	public void setPriceAfterTax(double priceAfterTax) {
		this.priceAfterTax = priceAfterTax;
	}
	
	/**
	 * La méthode qui servira du design pattern stretegy pour calcluer le pttc
	 * selon la catégorie du produit
	 * 
	 * @param taxType
	 * @return 
	 */
	public double calculatePriceAfterTax(TaxStrategy taxType) {
		double productsTax = taxType.getAppropriateTax(this.isImported) * this.getPriceBeforeTax();
		double pat = getApproximateTaxValue(this.getQuantity() * (this.getPriceBeforeTax() + productsTax));
		this.setPriceAfterTax(pat);
		this.setProductTax(pat - this.getPriceBeforeTax() * this.getQuantity());
		return pat;
	}
	
	/**
	 * Method pour calculer les taxes imputées selon la régle de gestion définit.
	 */
	private static double getApproximateTaxValue(double tax) {
		return (tax % 0.05 == 0) ? tax : tax + (0.05 - tax % 0.05);
	}
	
}
