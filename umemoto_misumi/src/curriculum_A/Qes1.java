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
		
		System.out.println();
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		//指定の変数を宣言し値を足した結果を出力しています。//
		
		System.out.println();
		int score = 80;
		score = score + 20;
		System.out.println("最終スコア:" + score);
		
		//指定の変数を宣言し値を更新した結果を出力しています。//
		
		System.out.println();
		double price = 99.99;
		int i = (int) price;
		System.out.println("整数価格:" + i);
		
		//指定の変数を宣言し型変換した結果を出力しています。//
		
		System.out.println();
		String numStr = "123";
		int num3 = Integer.parseInt(numStr);
		System.out.println(num3 +10);
		
		//指定の変数を宣言し型変換した値から足した結果を出力しています。//
		
		System.out.println();
		int num = 50;
		String num4 = String.valueOf(num);
		System.out.println("得点:" + num4);
		
		//指定の変数を宣言し型変換した値を出力しています。//
		
		System.out.println();
		int a = 10;
		int b = 20;
		boolean result = (a < b);
		System.out.println(result);
		
		//条件演算子を使用して指定の値を出力しています。//
		
		System.out.println();
		int x = 15;
		System.out.println(x >= 10 ?"OK" : "NG");
		
        //x が 10 以上なら "OK"、そうでなければ "NG" を出力しています。//
		
		System.out.println();
		String text ="私はJavaが好きです。Javaは楽しい！";
		String text2 = text.replace("Java","Python");
		System.out.println(text2);
		
		//文章の中にある 「Java」 を 「Python」 に置き換えて出力しています。//
		
	}

}
