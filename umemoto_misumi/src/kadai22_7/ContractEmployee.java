package kadai22_7;

//問７：契約社員の時給計算します//

public class ContractEmployee extends Employee {
	private static final int HOURLY_RATE = 1000;

    public ContractEmployee(String name, int hours) {
        super(name, hours);
    }
    
    //時給の計算//
    @Override
    public int calculateSalary() {
        return getHours() * HOURLY_RATE;
    }

}
