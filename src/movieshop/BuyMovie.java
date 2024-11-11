package movieshop;

public class BuyMovie {

	private Client client;
	private Movie movie;
	private double price;
	
	
	public BuyMovie(Client client, Movie movie, double price) {
		
		this.client = client;
		this.movie = movie;
		this.price = price;
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
	
	
}
