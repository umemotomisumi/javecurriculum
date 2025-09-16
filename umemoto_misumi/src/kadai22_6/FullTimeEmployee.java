package kadai22_6;

//問６：Billableを実装し、FullTimeEmployeeは1時間1250円、8時間超過は1.25倍にします。//

public class FullTimeEmployee implements Billable {
	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1250;
		int regularHours = hoursWorked;
		int overtimeHours = 0;

		if (hoursWorked > 8) {
			regularHours = 8; // 通常勤務は最大8時間
			overtimeHours = hoursWorked - 8; // 残業時間を計算
		}

		return (regularHours * hourlyRate) + (int) (overtimeHours * hourlyRate * 1.25);

	}

}
