package movieshop;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StaffGenderSet {

	private Set<Staff> femaleStaff = new HashSet<>();
	private Set<Staff> maleStaff = new HashSet<>();

	
	public void addStaff(List<Staff> staffList) {
        for (Staff staff : staffList) {
            if (staff.getGender() == 'M') {
                maleStaff.add(staff);
            } else if (staff.getGender() == 'F') {
                femaleStaff.add(staff);
            }
        }
    }
	
	
	
	public Set<Staff> returnMaleStaff(){
		return maleStaff;
	}
	
	public Set<Staff> returnFemaleStaff(){
		return femaleStaff;
	}
}
