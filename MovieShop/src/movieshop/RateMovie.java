package movieshop;

public class RateMovie {

	
	private Movie movie;
	private double rating;
	
	public RateMovie(Movie movie, double rating) {
	
		this.movie = movie;
		this.rating = rating;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
	
}
