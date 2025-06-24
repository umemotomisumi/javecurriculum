package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0L;
		float floatNum = 0.0f;
		double doubleNum = 0.0d;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;

		//それぞれのデータ型に変数の設定と初期値の代入をしています//

		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;

		//設問１で代入した初期値に指定された値を代入しています。//
		
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum * 2);
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum/100);
		System.out.println(byteNum - shortNum);
		
		//設問２代入した変数を用いて出力しています。//
		
		System.out.println();
		String name = "山田太郎";
		System.out.println("こんにちは、"+ name + "さん！");
		
		//指定の変数を宣言し値を代入して出力しています。//
		
		System.out.println();
		int age = 25;
		System.out.println("年齢:" + age + "歳");
		
		//指定の変数を宣言し値を代入して出力しています。//
		
	}

}
