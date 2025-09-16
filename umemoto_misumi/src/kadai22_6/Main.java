package kadai22_6;

import java.util.ArrayList;
import java.util.List;

//問６：List<Billable> に社員を複数追加し、for-each ループで costForDay を呼び出して日給を出力します//

public class Main{
	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee());
		employees.add(new ContractEmployee());
		
		for (Billable b : employees) {
		    int wage = b.costForDay(10);
		    System.out.println(wage);
		}
		
	}

}
