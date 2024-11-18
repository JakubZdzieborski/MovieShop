package movieshop;

public class BuyMovie extends Transaction {

	
	private double price;
	
	
	public BuyMovie(Client client, Movie movie, double price, double tax, String transactionId, String transactionDate) {
		super(client, movie, tax, transactionId, transactionDate);
		this.price = price;
	}


	@Override
	protected void processTranscation() {
		System.out.println("\nProcessing transaction for buying a movie: " + toString());
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}



	
	
}
