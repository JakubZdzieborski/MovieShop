package movieshop;

import exceptions.movieshop.NegativePriceException;

public final class BuyMovie extends Transaction {

	
	
	private double price;
	
	
	
	public BuyMovie(Client client, Movie movie, double price, double tax, String transactionId, String transactionDate) throws NegativePriceException {
		super(client, movie, tax, transactionId, transactionDate);
		if (price < 0) {
			throw new NegativePriceException("Price cannot be less than 0");
		}
		this.price = price;
	}


	@Override
	protected final void processTranscation() {
		System.out.println("\nProcessing transaction for buying a movie: " + toString());
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) throws NegativePriceException {
		if (price < 0) {
			throw new NegativePriceException("Price cannot be less than 0");
		}
		this.price = price;
	}



	
	
}
