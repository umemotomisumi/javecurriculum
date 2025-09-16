package kadai22_7;

//問７：正社員の時給計算します//

public class FullTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1200;
	
	//コンストラクタ//
    public FullTimeEmployee(String name, int hours) {
        super(name, hours);
    }

    @Override
    public int calculateSalary() {
        return getHours() * HOURLY_RATE;
    }

}
