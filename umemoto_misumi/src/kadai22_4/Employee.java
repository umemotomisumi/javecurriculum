package kadai22_4;

//問４:継承//

public abstract class Employee {
	String employeeId;
	String name;

	Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public abstract int calculateDailyWage(int hoursWorked);

}