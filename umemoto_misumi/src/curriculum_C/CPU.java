package curriculum_C;

import java.util.Random;

//課題7_24:勝つまで繰り返すじゃんけんプログラム//

//ランダムで手を選ぶクラスです//
public class CPU {
	private int hand;

	public void chooseHand() {
		Random random = new Random();
		this.hand = random.nextInt(3); // 0〜2のランダムな値//

	}
	
	public int getHand() {
		return hand;
	}

}
