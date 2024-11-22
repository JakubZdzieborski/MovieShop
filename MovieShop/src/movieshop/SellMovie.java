package movieshop;

public final class SellMovie extends Transaction {


	private double price;
	
	public SellMovie(Client client, Movie movie, double price, String transactionDate, double tax, String transactionId) {
		super(client, movie, tax, transactionId, transactionDate);
		this.price = price;
		
	}
	

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	protected final void processTranscation() {
		System.out.println("\nProcessing transaction for selling a movie: " + toString());

	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
