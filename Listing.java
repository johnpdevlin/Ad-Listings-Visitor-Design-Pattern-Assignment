package assignment3OOP;

public abstract class Listing implements AdsOnline {
	/*
	 * Super class
	 */
	
	
	// VARIABLES // 
	private String listingTitle;
	private String condition;
	private String description;
	private double price;
	private Seller seller;
	// VARIABLES // END //
	
	public Listing() {} // empty constructor
	
	public Listing(String listingTitle, String condition, String description, double price, Seller seller) {
		this.listingTitle = listingTitle;
		this.condition = condition;
		this.description = description;
		this.price = price;
		this.seller = seller;
	}
	
	public abstract void accept(Visitor visitor);

	public void setSeller(Seller seller) {
		// method not used in this implementation but may be useful
		this.seller = seller;
	}
	
	public void setSeller(String sellerName, String sellerEmail) {
		this.seller.setSellerName(sellerName);
		this.seller.setSellerEmail(sellerEmail);
	}
	
	public String getSeller() { 
		// method not used in this implementation but may be useful
		return "Seller : "+this.seller.getSellerName() + " ("+this.seller.getSellerEmail()+")";
	}
	
	
	/**
	 * @return the listingTitle
	 */
	public String getListingTitle() {
		return listingTitle;
	}

	/**
	 * @param listingTitle the listingTitle to set
	 */
	public void setListingTitle(String listingTitle) {
		this.listingTitle = listingTitle;
	}

	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
