package curriculum_B;

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
	}
}