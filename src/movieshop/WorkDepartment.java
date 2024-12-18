package movieshop;

public enum WorkDepartment {
	
	IT_DEPARTMENT("Department of Information Technology"),
	SALES_DEPARTMENT("Department of sales"),
	PR_DEPARTMENT("Department of Public Relations"),
	MANAGEMENT("Management");
	
	private final String description;

	WorkDepartment(String description) {
		this.description = description;
	}
	
	
	public String getDescription() {
		return description;
	}
	
}
