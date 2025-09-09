package kadai22_3;

//問３：カプセル化//

public class Employee {
	//プライベートフィールドを定義します。//
	private String employeeId;
	private String name;
	
	//フィールドにアクセスするために、以下のメソッドを用意します。//
	public void setEmployeeId(String id) {
		this.employeeId = id;

	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
		
	}

}
