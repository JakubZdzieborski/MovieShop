package movieshop;

public class MovieReviews {
	
	private Movie movie;
	private String review;
	
	public MovieReviews(Movie movie, String review) {
	
		this.movie = movie;
		this.review = review;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	

}
