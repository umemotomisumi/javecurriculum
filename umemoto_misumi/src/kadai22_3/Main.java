package kadai22_3;

public class Main {
	public static void main(String[] args) {
		//Employee オブジェクトを生成します。//
		Employee emp = new Employee();
		
		//setEmployeeIdメソッドとsetNameメソッドにそれぞれアクセス//
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		
		//getメソッドでそれぞれ出力しています。//
		System.out.print("社員ID: " + emp.getEmployeeId() + ",");
		System.out.println("名前: " + emp.getName());
		
	}

}
