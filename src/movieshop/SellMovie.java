package movieshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class SellMovie extends Transaction {
	private static final Logger logger = LogManager.getLogger(SellMovie.class);


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
		logger.info("\nProcessing transaction for selling a movie: " + toString());

	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
