package movieshop;

import java.util.Objects;

public class Movie implements ITitle, IGenre, IDirector, IYear, IDuration{
	
	private String title;
	private String genre;
	private String director;
	private int year;
	private int duration;
	
	
	public Movie(String title, String genre, String director, int year, int duration) {
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.year = year;
		this.duration = duration;
	}
	
	@Override
	public int getDuration() {
		return duration;
	}
	
	@Override
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int getYear() {
		return year;
	}
	

	@Override
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String getDirector() {
		return director;
	}
	
	@Override
	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	
	 @Override
	    public String toString() {
	        return title + " (" + year + ")";
	    }


	@Override
	public int hashCode() {
		return Objects.hash(director, duration, genre, title, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(director, other.director) && duration == other.duration
				&& Objects.equals(genre, other.genre) && Objects.equals(title, other.title) && year == other.year;
	}
	
	 
	 
	 

}
