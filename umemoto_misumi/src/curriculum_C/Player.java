package curriculum_C;

//課題7_24:勝つまで繰り返すじゃんけんプログラム//

import java.util.Scanner;

//ユーザー入力を受け取るクラスです//
public class Player {
	//handにユーザーが入力した値が入る//
	private int hand;
	
	 //修正箇所です！Scannerをフィールドにおく//
    private Scanner scanner = new Scanner(System.in);

	public void chooseHand() {
		System.out.println("グー(0), チョキ(1), パー(2) を入力: 0");//画面に表示//
		this.hand = scanner.nextInt();//ユーザーの入力を受け取る//

	}

	//handの値を返す//
	public int getHand() {
		return hand;
	}

}
