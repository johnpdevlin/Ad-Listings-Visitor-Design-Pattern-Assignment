package assignment3OOP;

public class Seller implements AdsOnline {

	private String sellerName;
	private String sellerEmail;
	
	public Seller(String sellerName, String sellerEmail) {
		// TODO Auto-generated constructor stub
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
	}
	
	public void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
	}

	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	/**
	 * @return the sellerEmail
	 */
	public String getSellerEmail() {
		return sellerEmail;
	}

	/**
	 * @param sellerEmail the sellerEmail to set
	 */
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	
	

}
