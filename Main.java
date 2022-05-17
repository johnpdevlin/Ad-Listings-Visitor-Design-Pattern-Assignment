package assignment3OOP;

import java.util.Scanner;

public class Main {

	static boolean running = true;
	
	static Scanner scanner = new Scanner(System.in);
	
	static AdsList ad1 = new AdsList(); 
	
	// VISITOR OBJECTS INITIALISED //  
	static DisplayListings visitor2 = new DisplayListings();
	static TotalCost visitor1 = new TotalCost();
	static CountByCategory visitor = new CountByCategory();
	// VISITOR OBJECTS END //
	
	
	// METHODS START //
	public void runUI() {
		System.out.println(   "\nPlease select an option from the list below to continue or type -1 to exit: ");
		System.out.println(   "  1. Add a new listing"
							+ "\n  2. Remove a listing"
							+ "\n  3. Display all listings"
							+ "\n  4. Get cost of all live listings"
							+ "\n  5. Count listings by category");
		requestHandler(scanner.nextInt());// passes user choice to request handler
	}
	
	public void requestHandler(int request) {
		// Handles user request
		if (request != -1) {
			if (request == 1) {
				// TO ADD LISTING
				addRequest(request);
			}
			else if (request == 2 ) {
				// TO REMOVE LISTING
				removeRequest();
			}
			else if (request == 3 ) {
				// TO DISPLAY LISTINGS
				displayRequest();
			}
			else if (request == 4 ) {
				// TO CALC TOTAL COST
				costRequest();
			}
			else if (request == 5 ) {
				// TO COUNT CATEGORIES
				countCatRequest();
			}
			else {
				// INVALID INPUT
				System.out.println("Invalid input");
			}
		}
	    else {
	    	// IF -1 entered, terminates loop
	    	running = false;
	    }
	}
	
	private void addRequest(int request) { 
		// Handles requests to add listings
		boolean invalid = false;
		
		while (invalid == true) { // WHILE LOOP START //
			// Runs until user enters valid entry
			
			System.out.println("Please choose a listing type to add: 1. General 2. CarListing 3. BookListing");
			int choice = scanner.nextInt();
			
			System.out.println("Please enter your listing details... ");
			
			
			// CONDITIONS START //
			if (choice == 1) { // ADD general listing
				GeneralListing l = new GeneralListing();			
				
				enterBasicDetails(l); // calls function to request and set basic details
				ad1.addListing(l); // adds l to array	
			}
			
			else if (choice == 2) { // CARLISTING
				CarListing l = new CarListing();
					// Requests and sets car specific details
					System.out.println("Make: ");
					l.setCarMake(scanner.next());
					System.out.println("Model: ");
					l.setCarModel(scanner.next());
					System.out.println("EngineSize: ");
					l.setCarEngineSize(scanner.next());	
					System.out.println("Year: ");
					l.setYear(scanner.next());
					
				enterBasicDetails(l);
				ad1.addListing(l);
			}
			else if (choice == 3) { // BOOKLISTING
				BookListing l = new BookListing();
					// requests and sets book specific details
					System.out.println("Book Title: ");
					l.setBookTitle(scanner.next());
					System.out.println("Author: ");
					l.setBookAuthor(scanner.next());
					System.out.println("ISBN: ");
					l.setBookIsbn(scanner.next());	
					
				enterBasicDetails(l);
				ad1.addListing(l);
			}
			else { // INVALID
				System.out.println("Invalid choice.");
				invalid = true;
			}
			// CONDITIONS // END //
		} // WHILE LOOP // END//
	}
	
	private void removeRequest() {
		
		displayRequest();
		System.out.println("Enter listing # to Remove: ");
		ad1.removeListing(scanner.nextInt());		
	}
	
	private void displayRequest(){	
		ad1.accept(visitor2);
		visitor2.printListings();
	}
	
	private void costRequest() {
		ad1.accept(visitor1);
		System.out.println("Total Cost of all Listings: "+visitor1.getTotalCost());
	}
	
	private void countCatRequest() {
		ad1.accept(visitor);
		visitor.getCatCount();
	}	
	
	
	private void enterBasicDetails(Listing l) {
		enterSeller(l); // calls function to request and set seller details
		
		System.out.println("Listing Title: ");
			l.setListingTitle(scanner.next());
		
		System.out.println("Description: ");
			l.setDescription(scanner.next());
			
		System.out.println("Condition: ");
			l.setCondition(scanner.next());
			
		System.out.println("Price: ");
			l.setPrice(scanner.nextDouble());			
	} 
	
	private void enterSeller(Listing l) {
		// requests ands sets seller details
		System.out.println("Please enter your personal details...");
		System.out.println("  Name:");
		String name = scanner.next();
		System.out.println("  Email: ");
		String email = scanner.next();
		
		Seller seller = new Seller(name, email); // Creates Seller object
		l.setSeller(seller); // Adds Seller to listing
	}
	

	// METHODS // END //
	

	// MAIN METHOD START //
	public static void main(String[] args) {
		
		// CREATES SAMPLE LISTINGS //
		Seller j1 = new Seller("Jim Murphy", "jm@mmail.ie"); 
		Seller j2 = new Seller("Lisa Freeman", "0101012");
		Seller j3 = new Seller("Joe Joerson", "123@fak.ie");
		//
		
		Book b1 = new Book("Tennis Party", "Joe Joerson", "ABC123");
		Book b2 = new Book("Yoga Lyf", "Walter Brown", "CBA321");
		Book b3 = new Book("History Tomorrow", "Lesley Morin", "XYZ987");
		
		Car c1 = new Car("Ford", "Solero", "1.2L");
		
		ad1.addListing(new CarListing("Banger for sale", "Not long left", "Ideal for handbrake turns in fields.", c1, "1992", 100.00, j3));
		ad1.addListing(new GeneralListing("Free Yoga Classes", "n/a", "Yoga classes. Ideal for beginners.", 00.00, j2));
		ad1.addListing(new BookListing("This Book will change your life!", "A romantic novel about tennis", b1, "Brand New", 20.00, j3));
		ad1.addListing(new CarListing("Banger for sale", "Not long left", "Ideal for handbrake turns in fields.", c1, "1992", 100.00, j1));
		ad1.addListing(new GeneralListing("Free Yoga Classes", "n/a", "Yoga classes. Ideal for beginners.", 00.00, j2));
		ad1.addListing(new BookListing("This Book will also change your life!", "Uneeded", b2, "Brand New", 20.00, j3));
		ad1.addListing(new CarListing("Banger for sale", "Not long left", "Ideal for handbrake turns in fields.", c1, "1992", 100.00, j2));
		ad1.addListing(new BookListing("My favourite book", "A book", b3, "Worn", 20.00, j3));	
		// //
		
		System.out.println("~ ~ Welcome to Ads Online ~ ~ "); // Welcome message (runs once)
		
		while (running) { 
			// Runs until user terminates (-1)
			Main m = new Main();
			m.runUI();
		}
		
		System.out.println("The program is terminated.");
		
	}	// MAIN METHOD // END //	
	
} // CLASS // END //
