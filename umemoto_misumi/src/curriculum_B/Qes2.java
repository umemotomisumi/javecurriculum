package curriculum_B;

public class Qes2 {
	public static void main(String[] args) {
		int score = 75;
		if (score >= 60)
			System.out.println("合格です！");

		//指定の条件分岐を実行しました。//
		System.out.println();
		int age = 25;
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}

		//年齢が20歳以上30歳以下なら適正年齢ですと、それ以外ば対象外ですとコンソールに表示させます。//
		System.out.println();
		age = 18;

		if (age >= 20) {
			System.out.println("成人です");
		} else if (age >= 13 && age <= 19) {
			System.out.println("ティーンエイジャーです");
		} else if (age >= 12) {
			System.out.println("子供です");
		}

		//20歳以上なら成人、13歳以上19歳未満ならティーンエイジャー、12歳以下なら子供とコンソールに表示させます。//

		System.out.println();
		int x = 30;
		int y = 15;
		int z = 50;

		int max = x; //xが最大と仮定しています。//

		if (y > max) {
			max = y;
		}

		if (z > max) {
			max = z;
		}
		System.out.println(max);

		//一番大きい数値を判定してコンソールに表示させます。//

		System.out.println();
		int num = 1;
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0です");
		} else {
			System.out.println("負の数です");
		}

		//numを1とし、大きいか小さいか同じかの結果をコンソールに表示させます。//

		System.out.println();
		if (num % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

		//numを1とし、偶数か奇数かの結果をコンソールに表示させます。//

	}

}