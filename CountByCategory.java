package assignment3OOP;

public class CountByCategory implements Visitor {

	// VARIABLES //
	private int genCatCount;
	private int carCatCount;
	private int bookCatCount;
	// VARIABLES // END //

	public void visit(Listing listing) {
		// Visits all Listings to count categories
		if (listing instanceof GeneralListing) {
			this.genCatCount++;
		}
		else if (listing instanceof CarListing) {
			this.carCatCount++;
		}
		else if (listing instanceof BookListing) {
			this.bookCatCount++;
		}
	}

	public void getCatCount() {
		// Prints out category count
		System.out.println("Number of listings by category: \nGeneral: "+genCatCount+"\nCar: " +carCatCount+"\nBook: "+bookCatCount);
	}
	
	public int getGenCount() {
		// method not used in this implementation but may be useful
		return genCatCount;
	}
	
	public int getCarCount() {
		// method not used in this implementation but may be useful
		return carCatCount;
	}

	public int getBookCount() {
		// method not used in this implementation but may be useful
		return bookCatCount;
	}
	@Override
	public void visit(AdsOnline adsOnline) {}
	


}
