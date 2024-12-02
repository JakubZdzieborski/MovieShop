package movieshop;

import exceptions.movieshop.ClientNotFoundException;

public class ClientStats {

	
	private Client client;
	private double moneySpent;
	private int moviesBought;
	private int moviesRented;
	
	public ClientStats(Client client, double moneySpent, int moviesBought, int moviesRented) throws ClientNotFoundException {
		
		if (client == null ) {
			throw new ClientNotFoundException("Client does not exist");
		}
		
		this.client = client;
		this.moneySpent = moneySpent;
		this.moviesBought = moviesBought;
		this.moviesRented = moviesRented;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public double getMoneySpent() {
		return moneySpent;
	}
	public void setMoneySpent(double moneySpent) {
		this.moneySpent = moneySpent;
	}
	public int getMoviesBought() {
		return moviesBought;
	}
	public void setMoviesBought(int moviesBought) {
		this.moviesBought = moviesBought;
	}
	public int getMoviesRented() {
		return moviesRented;
	}
	public void setMoviesRented(int moviesRented) {
		this.moviesRented = moviesRented;
	}
	
	
	
}
