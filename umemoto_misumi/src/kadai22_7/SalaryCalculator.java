package kadai22_7;

//問７：給与計算します//

public class SalaryCalculator {
	public void print(Employee e) {
        System.out.println(e.getName() + " の給料は " + e.calculateSalary() + " 円");
    }

}