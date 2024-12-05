package movieshop;

import java.util.LinkedHashMap;
import java.util.Map;

public class StaffDepartment {

	private Map<Staff, String> staffByDepartment = new LinkedHashMap<>();
	
	public void assignDepartment(String department, Staff staff) {
		staffByDepartment.put(staff, department);
	}
	
	
	public String getStaffDepartment(Staff staff) {
        return staffByDepartment.get(staff);
    }

    public void displayDepartments() {
        for (Map.Entry<Staff, String> entry : staffByDepartment.entrySet()) {
            System.out.println(entry.getValue().toString() + " --> " + entry.getKey());
	
        }
    }
}
