package kadai22_4;

public class Main {
	 public static void main(String[] args) {
		 //fullTimeEmployeeとpartTimeEmployeeのオブジェクトを生成//
		 FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("E003","山田花子");
		 PartTimeEmployee partTimeEmployee = new PartTimeEmployee("E004","佐藤太郎");
		 
		 //calculateDailyWageメソッドを呼び出しkyuyoに引数９を渡す//
		 int seishainkyuyo = fullTimeEmployee.calculateDailyWage(9);
		 int partkyuyo = partTimeEmployee.calculateDailyWage(9);
		 
		//正社員の給与の給与を出力//
		 System.out.println("正社員の給与:" + seishainkyuyo + "円");
		 //パート社員の給与の給与を出力//
		 System.out.println("パート社員の給与:" + partkyuyo + "円");
		 
	 }

}