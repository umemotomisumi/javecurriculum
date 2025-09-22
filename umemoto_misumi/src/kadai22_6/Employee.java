package kadai22_6;

//問６：抽象クラスEmployeeを作成します。//

public abstract class Employee implements Billable{
	//フィールド//
	String id;
	String name;

	//コンストラクタ//
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//抽象メソッド//
	public abstract int costForDay(int hoursWorked);

}
