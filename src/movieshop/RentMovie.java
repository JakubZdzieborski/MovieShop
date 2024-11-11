package movieshop;

public class RentMovie {


	private Client client;
	private Movie movie;
	private String startRentDate;
	private String endRentDate;
	private double dayPrice;
	
	public RentMovie(Client client, Movie movie, String startRentDate, String endRentDate, double dayPrice) {
	
		this.client = client;
		this.movie = movie;
		this.startRentDate = startRentDate;
		this.endRentDate = endRentDate;
		this.dayPrice = dayPrice;
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
	public String getStartRentDate() {
		return startRentDate;
	}
	public void setStartRentDate(String startRentDate) {
		this.startRentDate = startRentDate;
	}
	public String getEndRentDate() {
		return endRentDate;
	}
	public void setEndRentDate(String endRentDate) {
		this.endRentDate = endRentDate;
	}
	public double getDayPrice() {
		return dayPrice;
	}
	public void setDayPrice(double dayPrice) {
		this.dayPrice = dayPrice;
	}

	
	
}
