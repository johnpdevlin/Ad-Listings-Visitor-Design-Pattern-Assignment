package assignment3OOP;

public abstract interface AdsOnline extends Element {
	/*
	 * This interface associates all the various classes together
	 * It also leaves room open for later extension
	 */
	
	
	public default void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
		}
		
}
