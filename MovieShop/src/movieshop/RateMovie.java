package movieshop;

import exceptions.movieshop.MovieNotFoundException;

public class RateMovie {

	
	private Movie movie;
	private double rating;
	
	public RateMovie(Movie movie, double rating) throws MovieNotFoundException{
		if (movie == null) {
			throw new MovieNotFoundException("Movie not found");
		}
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
