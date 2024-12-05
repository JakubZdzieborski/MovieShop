package movieshop;

public class Membership {

	private Client client;
	public Membership(Client client) {
		
		this.client = client;
	}
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Membership [client=" + client + "]";
	}

	
	
}
