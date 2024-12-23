package movieshop;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StaffDepartment {

	private static final Logger logger = LogManager.getLogger(StaffDepartment.class);

	
	private Map<Staff, String> staffByDepartment = new LinkedHashMap<>();
	
	public void assignDepartment(String department, Staff staff) {
		staffByDepartment.put(staff, department);
	}
	
	
	public String getStaffDepartment(Staff staff) {
        return staffByDepartment.get(staff);
    }

    public void displayDepartments() {
        for (Map.Entry<Staff, String> entry : staffByDepartment.entrySet()) {
        	logger.info(entry.getValue().toString() + " --> " + entry.getKey());
	
        }
    }
}
