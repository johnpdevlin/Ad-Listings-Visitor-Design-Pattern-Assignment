package assignment3OOP;

import java.util.concurrent.atomic.AtomicInteger;

public class DisplayListings implements Visitor {
	
	AtomicInteger no = new AtomicInteger(0); // #counter to keep track of listings to help user remove correct entry
	StringBuffer print = new StringBuffer(); // StringBuffer used as performs better than String

	@Override
	
	public void visit(Listing listing) {
		// Visits and creates StringBuffer
		
		
		if (listing instanceof GeneralListing) {
			print.append("\n Title: " +listing.getListingTitle()+
					 "\n Description: " +listing.getDescription()+
					 "\n Seller: " +listing.getSeller()+
					 "\n Price: " +listing.getPrice()+
					 "\n #"+no.incrementAndGet());
					 
		}
		else if (listing instanceof CarListing) {
			print.append("\n Title: " +listing.getListingTitle()+
					   "\n Description: " +listing.getDescription()+
					   "\n Make: " +((CarListing) listing).getCarMake()+
					   "\n Model: " +((CarListing) listing).getCarModel()+
					   "\n Year: " +((CarListing) listing).getYear()+
					   "\n Engine Size: " +((CarListing) listing).getCarEngineSize()+
					   "\n Seller: " +listing.getSeller()+
					   "\n Price: " +listing.getPrice()+
					   "\n #"+no.incrementAndGet());
			
		}
		else if (listing instanceof BookListing) {
			print.append("\n Title: " +listing.getListingTitle()+
					   "\n Book Title: " +((BookListing) listing).getBookTitle()+
					   "\n Author: " +((BookListing) listing).getBookAuthor()+
					   "\n Description: " +listing.getDescription()+
					   "\n ISBN: " +((BookListing) listing).getBookIsbn()+
					   "\n Seller: " +listing.getSeller()+
					   "\n Price: " +listing.getPrice()+ 
					   "\n #"+no.incrementAndGet());
		}
		else {
			System.out.println("something went wrong...");
		}
			print.append("\n");
	}
	

	public void printListings() {
		System.out.print(print);
		print.delete(0, print.length()); // clears print stringbuffer
		no.getAndSet(0); // resets #counter
	}
	
	@Override
	public void visit(AdsOnline instance) {
		// TODO Auto-generated method stub
		return;
	}
	

}
