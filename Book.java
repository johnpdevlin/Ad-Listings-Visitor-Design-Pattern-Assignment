/**
 * 
 */
package assignment3OOP;


/**
 * @author j
 *
 */
public class Book implements AdsOnline {
	
	/* 
	 * Class created to avoid duplication of variables specific to a book, should the same book be listed
	 */
	
	// VARIABLES //
	private String author;
	private String title; 
	private String isbn;
	// VARIABLES // END //
	
	public Book(String title, String author, String isbn) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	
	public void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
	}


	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}


	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	

}
