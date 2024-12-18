package movieshop;

public enum MovieGenre {
	ACTION("Action movie"),
    COMEDY("Comedy movie"),
    DRAMA("Darama movie"),
    HORROR("Horror movie"),
    SCI_FI("Sci-Fi movie");

    private final String description;

    MovieGenre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
