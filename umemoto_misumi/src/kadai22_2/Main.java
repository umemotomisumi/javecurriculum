package kadai22_2;

public class Main {
	public static void main(String[] args) {
		//Employee クラスのインスタンスを生成します。//
		Employee emp = new Employee();

		//employeeId に「E001」、name に「佐藤太郎」を設定します。//
		emp.employeeId = "E001";
		emp.name = "佐藤太郎";
		
		//showInfo()を呼び出します//
		emp.showInfo();
	}

}
