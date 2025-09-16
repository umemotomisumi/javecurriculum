package kadai22_7;

//問７：FullTimeEmployeeとContractEmployeeを出力し社員の日給を表示します//

public class Main {
	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee("田中", 8);
        Employee e2 = new ContractEmployee("佐藤", 6);

        SalaryCalculator report = new  SalaryCalculator();
        report.print(e1);
        report.print(e2);
	}

}
