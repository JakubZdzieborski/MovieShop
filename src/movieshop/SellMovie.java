package movieshop;

public class SellMovie {

	
	private Client client;
	private Movie movie;
	private double price;
	private String transactionDate;
	public SellMovie(Client client, Movie movie, double price, String transactionDate) {
		
		this.client = client;
		this.movie = movie;
		this.price = price;
		this.transactionDate = transactionDate;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}
