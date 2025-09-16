package kadai7_23;

//課題7_23：自己紹介プログラムを作成します//

public class Main {
	public static void main(String[] args) {
		//Personクラスのpersonを出力//
		Person person = new Person("梅本望純",27,1.6,60);
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.height);
		
		//Personクラスのprintを呼び出し//
		person.print();
		
		System.out.println("合計1人です");
	}
	

}
