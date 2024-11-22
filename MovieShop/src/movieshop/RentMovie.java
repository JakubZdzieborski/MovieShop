package movieshop;


public final class RentMovie extends Transaction {


	private String startRentDate;
	private String endRentDate;
	private double dayPrice;

	
	public RentMovie(Client client, Movie movie, double tax, String transactionId, String transactionDate, 
			String startRentDate, String endRentDate, double dayPrice) {
		super(client, movie, tax, transactionId, transactionDate);
		this.startRentDate = startRentDate;
		this.endRentDate = endRentDate;
		this.dayPrice = dayPrice;
	}
	
	@Override
	protected final void processTranscation() {
		System.out.println("\nProcessing transaction for renting a movie: " + toString());
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

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	

	
	
}
