package kadai22_2;

//問２：クラスとオブジェクト//

//Employeeクラスで以下のフィールドを用意します//
public class Employee {
	String employeeId;
	String name;
	
	//showInfo()メソッドを用意します。//
	public void showInfo() {
		System.out.println("社員ID:" + employeeId + ", 名前: " + name);
	}
}
