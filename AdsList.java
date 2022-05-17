package assignment3OOP;

import java.util.ArrayList; //ArrayList used as access by index is needed 

public class AdsList implements AdsOnline {

	private ArrayList<Listing> adsList;
	// ArrayList created; accepts objects(sub-classes of Listing)

	public AdsList() {
		this.adsList = new ArrayList<Listing>();
	}
	
	public void addListing(Listing l) {
		// ADDS listing to adsList
		this.adsList.add(l);
	}
	
	public void removeListing(int indx) {
		// REMOVES listing from adsList
		// indx-1, to remove 0 as indx for UI
		adsList.remove(indx-1); 
		System.out.println("Listing #"+indx+" has been removed.");
	}
	
	public ArrayList<Listing> getAdsList() {
		// RETURNS adList
		return adsList;
	}
	
	public void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
		
		// then sends the visitor to all its sub parts
		for(Listing ad : adsList) {
			ad.accept(visitor);
		}
	}
}

