package movieshop;

public class ShopStats {

	private int moviesAvailable;
	private int numOfCustomers;
	
	public ShopStats(int moviesAvailable, int numOfCustomers) {
		this.moviesAvailable = moviesAvailable;
		this.numOfCustomers = numOfCustomers;
	}
	
	public int getMoviesAvailable() {
		return moviesAvailable;
	}
	public void setMoviesAvailable(int moviesAvailable) {
		this.moviesAvailable = moviesAvailable;
	}
	public int getNumOfCustomers() {
		return numOfCustomers;
	}
	public void setNumOfCustomers(int numOfCustomers) {
		this.numOfCustomers = numOfCustomers;
	}

	
}
