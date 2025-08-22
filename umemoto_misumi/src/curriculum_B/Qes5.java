package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {

		//問１：引数、戻り値なしのメソッドhelloWorld を作成しています。//
		helloWorld(); //？これは何の宣言かよくわかりません。必要ですか？//

		System.out.println();//答えと答えの間の改行//

		//問２： メソッド doubleValue を作成しています。//
		System.out.println(doubleValue(10));

	} //？ここで閉じないとエラーになるのはなぜですか？//

	//問１：helloWorld を作成しています。//
	public static void helloWorld() {
		System.out.println("Hello,World!");

	}

	//問２：引数：整数 (int num)を宣言し、結果が２倍になるメソッドを表示しています。//
	public static int doubleValue(int num) {
		return num * 2;
	}

}
