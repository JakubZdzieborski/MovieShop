package movieshop;

public class MovieStatus {

	private Movie movie;
	private boolean isAvailable;

	public MovieStatus(Movie movie, boolean isAvailable) {

		this.movie = movie;
		this.isAvailable = isAvailable;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
