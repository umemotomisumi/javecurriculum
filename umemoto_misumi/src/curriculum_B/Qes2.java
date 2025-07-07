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

		System.out.println();
		score = (int) (Math.random() * 100) + 1;
		System.out.println("スコア:" + score);

		if (score >= 90) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		//スコアの値をランダムに表示し、当てはまる結果をコンソールに表示させます。//

		System.out.println();
		String input = null;
		if (input == null || input.isEmpty()) {
			System.out.println("入力が無効です");
		}

		// null または空文字（""）のときに「入力が無効です」と表示させます。//

		System.out.println();
		int day = (int) (Math.random() * 7) + 1;

		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");
		}

		System.out.println();
		int month = (int) (Math.random() * 12) + 1;

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("無効な月です");
		}
	
	//1から12のランダムな数字の中で当てはまる季節をコンソールに表示させます。//

	}

}