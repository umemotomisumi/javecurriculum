package kadai22_4;

public class PartTimeEmployee extends Employee {
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	private static final int HOURLY_RATE = 1000;

	public int calculateDailyWage(int hoursWorked) {
		int partkyuyo = hoursWorked * HOURLY_RATE;
		return partkyuyo;

	}

}

/*class PartTimeEmployee{
//時給1000円
private static final int HOURLY_RATE = 1000;
//calculateDailyWage(引数「9」)
public  int calculateDailyWage(int hoursWorked) {
	//9時間*時給1000円
	int kyuyo = hoursWorked * HOURLY_RATE;
	//9000円をmainクラスに返す
	return kyuyo;
}
}*/