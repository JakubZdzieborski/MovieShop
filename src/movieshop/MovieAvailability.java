package movieshop;

public enum MovieAvailability {

	 	AVAILABLE("Available"),
	    NOT_AVAILABLE("Not Available");

	    private final String status;

	    MovieAvailability(String status) {
	        this.status = status;
	    }

	    public String getStatus() {
	        return status;
	    }

	 
}
