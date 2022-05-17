package assignment3OOP;

public class CarListing extends Listing {
	
	// VARIABLES //
	private Car c;
	private String year;
	// VARIABLES // END 
	
	public CarListing() {} // empty  constructor
	
	public CarListing(String listingTitle, String condition, String description, Car c, String year, double price, Seller seller) {
		super(listingTitle, condition, description, price, seller);
		// TODO Auto-generated constructor stub
		this.c = c;
		this.year = year;
	}
	
	// SETTERS & GETTERS FOR CAR //
	public void setCarModel(String m) {
		this.c.setModel(m);
	}
	
	public void setCarMake(String m) {
		this.c.setMake(m);
	}
	
	public void setCarEngineSize(String e) {
		this.c.setEngineSize(e);
	}
	
	public String getCarModel() {
		return this.c.getModel();
	}
	
	public String getCarMake() {
		return this.c.getMake();
	}
	
	public String getCarEngineSize() {
		return this.c.getEngineSize();
	}
	// SETTERS & GETTERS // END
	
	public void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

}
