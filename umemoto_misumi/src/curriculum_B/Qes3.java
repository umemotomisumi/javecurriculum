package curriculum_B;

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

		//Scannerとwhile文を使用して入力が0になるまで何度でも入力を受け付け、0が入力されたら「終了しました」と表示される実装をしています。//

		System.out.println("終了しました");

		System.out.println();
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.println(a + "*" + b + "=" + (a * b));
			}
		}
		
		//for文を使用して九九の表を表示させます。//
		
	}
}