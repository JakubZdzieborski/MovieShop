package movieshop;

public class ContactForm {

	private Client client;
	private String message;
	
	public ContactForm(Client client, String message) {
		
		this.client = client;
		this.message = message;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
