package curriculum_B;

public class Qes5 {
	//問１：helloWorld を作成しています。//
	public static void helloWorld() {
		System.out.println("Hello,World!");

	}

	//問２：引数：整数 (int num)を宣言し、結果が２倍になるメソッドを表示しています。//
	public static int doubleValue(int num) {
		return num * 2;
	}

	//問３： メソッド isEven を作成しています。//
	public static boolean isEven(int num) {
		return num % 2 == 0; // 割り切れたらtrue、そうでなければfalse//
	}

	public static void main(String[] args) {

		//問１：引数、戻り値なしのメソッドhelloWorldを作成しています。//
		helloWorld();

		System.out.println();//答えと答えの間の改行//

		//問２： メソッド doubleValue を作成しています。//
		System.out.println(doubleValue(10));

		System.out.println();//答えと答えの間の改行//
		
		//問３；num1に7,num2に10を設定し真偽値の戻り値を表示させます。//
		int num1 = 7;
		int num2 = 10;
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else {
			System.out.println(num1 + "は奇数です。");
		}
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		} else {
			System.out.println(num2 + "は奇数です。");
		}

	}

}
