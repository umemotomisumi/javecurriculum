package employee;

//①基本概念　条件に沿って Java プログラムを作成し、出力しています。//

public class Employee {
	//フィールド//
	String name;

	//メソッド//
	void work() {
		System.out.println(name + "は働いています。");
	}

	public static void main(String[] args) {
		// インスタンスの生成
		Employee emp  = new Employee();
		
		//name に「山田太郎」を設定する。//
		emp.name = "山田太郎";
		
		//work() を呼び出して出力を確認する。//
        emp.work();
	}

}
