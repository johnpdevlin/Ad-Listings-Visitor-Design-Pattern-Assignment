package assignment3OOP;

public class BookListing extends Listing {
	
	private Book b;
	
	public BookListing() {} // empty  constructor
	
	public BookListing(String listingTitle, String description, Book b, String condition, double price, Seller seller) {
		super(listingTitle, condition, description, price, seller);
		// TODO Auto-generated constructor stub
		this.b = b;
	}
	
	// SETTERS & GETTERS FOR CAR //
		public void setBookAuthor(String a) {
			this.b.setAuthor(a);
		}
		
		public void setBookTitle(String t) {
			this.b.setTitle(t);
		}
		
		public void setBookIsbn(String i) {
			this.b.setIsbn(i);
		}
		
		public String getBookAuthor() {
			return this.b.getAuthor();
		}
		
		public String getBookTitle() {
			return this.b.getTitle();
		}
		
		public String getBookIsbn() {
			return this.b.getIsbn();
		}
		
		
		// SETTERS & GETTERS end
	
	
	public void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
	}

}
