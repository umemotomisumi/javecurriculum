package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		//for文を使用して1から10までの数字をコンソールに表示させます。//

		System.out.println();
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

		//for文を使用して2から20までの偶数をコンソールに表示させます。//

		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		//for文を使用して10から1までの数字をカウントダウンでコンソールに表示させます。//

		System.out.println();
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		//for文を使用して1から100までの数字を合計しコンソールに表示させます。//

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		//for文を使用して三角形を出力しています。//

		System.out.println();
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		//while文を使用して1から10までの数字をコンソールに表示させます。//

		System.out.println();
		i = 2;
		while (i <= 20) {
			System.out.println(i);
			i += 2;
		}

		//while文を使用して2から20までの偶数をコンソールに表示させます。//

		System.out.println();
		i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		//while文を使用して10から1までの数字をカウントダウンでコンソールに表示させます。//

		System.out.println();
		sum = 0;
		i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		//while文を使用して100から1までの数字を足してコンソールに表示させます。//

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		while (num != 0) {
			System.out.println("入力された数値: " + num);
			num = scanner.nextInt();
		}

		scanner.close();

		//Scannerとwhile文を使用して入力が0になるまで何度でも入力を受け付け、0が入力されたら「終了しました」と表示される実装をしています。//

		System.out.println("終了しました");

		System.out.println();
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.printf("%d×%d=%2d || ", a, b, a * b);
			}

			System.out.println();
		}

		//for文を使用して九九の表を表示させます。//

		System.out.println();
		String iteminput = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		String[] items = iteminput.split("、");

		Random rand = new Random();

		int tvstock = rand.nextInt(12); //テレビのストックは変数tvstockで指定します。//
		int displaystock = 11 - tvstock; //テレビとディスプレイは合わせて11になるように指定します//

		for (String item : items) {
			item = item.trim();

			switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int stock = rand.nextInt(12);
				System.out.println(item + "の残り台数は" + stock + "台です");
				break;
			case "テレビ":
				System.out.println("テレビの残り台数は" + tvstock + "台です");
				break;
			case "ディスプレイ":
				System.out.println("ディスプレイの残り台数は" + displaystock + "台です");
				break;
				
			default :
				System.out.println("「" + item + "」は指定の商品ではありません");

			}
		}

		//商品の残り台数が出力されるシステムを出力しています。//

	}
}