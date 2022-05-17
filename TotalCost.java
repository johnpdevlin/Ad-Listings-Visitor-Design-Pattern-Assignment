package assignment3OOP;
	
	public class TotalCost implements Visitor {
	
	private double total; // running total
		
	public void visit(Listing listing) {
		// TODO Auto-generated method stub
		if (listing instanceof Listing) {
			total += ((Listing)listing).getPrice(); 
		}
		else {
			System.out.println("something went wrong..");
		}
	}
	
	public double getTotalCost() {
		return total;
	}

	@Override
	public void visit(AdsOnline a) {}


}
