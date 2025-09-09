package kadai22_4;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	//時給//
	private static final int HOURLY_RATE = 1200;
	//残業代//
	private static final double OVERTIME_RATE = 1.25;

	public int calculateDailyWage(int hoursWorked) {
		//8時間以内は通常の時給//
		if (hoursWorked <=8) {
			return hoursWorked * HOURLY_RATE;
		}

	else {
		//通常勤務時間//
		int normalHours = 8;
		//8時間を超えた場合は残業//
		int overtimeHours = hoursWorked - 8;
        int seishainkyuyo = (normalHours * HOURLY_RATE) 
                  + (int)(overtimeHours * HOURLY_RATE * OVERTIME_RATE);
        return seishainkyuyo;
	}
}
}

