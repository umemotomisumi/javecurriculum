package kadai22_5;

//問５：社員リスト（List<Employee>）に FullTimeEmployee と ContractEmployee を複数追加します//

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new FullTimeEmployee("F001", "山田太郎"));
		employees.add(new FullTimeEmployee("F002", "佐藤花子"));
		employees.add(new ContractEmployee("C001", "鈴木一郎"));
		employees.add(new ContractEmployee("C002", "高橋恵子"));
		
		///for-each ループで calculateDailyWage を呼び出し、各社員の給料を出力します//
		
		for (Employee e : employees) {
            int salary = e.calculateDailyWage(9); // 仮に9時間勤務
            System.out.println(e.getName() + " の給与: " + salary + "円");
		}
	}

}
