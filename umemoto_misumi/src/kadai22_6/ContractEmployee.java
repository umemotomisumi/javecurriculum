package kadai22_6;

//問６：Billableを実装し、ContractEmployee: 1時間1000円にします。//

public class ContractEmployee implements Billable {
	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}

}
