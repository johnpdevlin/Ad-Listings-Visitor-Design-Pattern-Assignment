package assignment3OOP;

public class GeneralListing extends Listing {

	public GeneralListing(String listingTitle, String condition, String description, double price, Seller seller) {
		super(listingTitle, condition, description, price, seller);
	}

	public GeneralListing() {} // Empty constructor

	public void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
	}


}
