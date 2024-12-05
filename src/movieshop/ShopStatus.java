package movieshop;

public class ShopStatus {

	private boolean isClosed;
	
	

	public ShopStatus(boolean isClosed) {
		
		this.isClosed = isClosed;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	
	public String shopStatusCheck(boolean isClosed) {
		
		if (isClosed == true) {
		return "Shop is closed";
		} else {
			return "Shop is open";
		}
		
	}
	
}
