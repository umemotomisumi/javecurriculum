package curriculum_B;

import java.util.Arrays;
import java.util.Scanner;

public class Qes4 {
	public static void main(String[] args) {

		//問１：int型の配列numを用意し配列の全要素を順番に表示させます。//
		int num[] = new int[5];

		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);

		//問２：nt 型の配列 {10, 20, 30, 40, 50} を用意し配列の要素を 逆順 に表示させます//

		/*int[] num2 = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(num2));
		
		for (int f = 0, l = num2.length - 1; f < l; f++, --l) {
		
			int temp = num2[f];
			num2[f] = num2[l];
			num2[l] = temp;
		}
		
		System.out.println(Arrays.toString(num2));*/

		//問２：下記訂正後の回答になります//
		System.out.println();
		int[] num2 = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(num2));

		for (int i = num2.length - 1; i >= 0; i--) {
			System.out.print(num2[i] + " ");
		}

		//問３：int 型の配列 {3, 5, 7, 9, 11} を用意し配列の全要素の 合計値 を計算し表示させます。//
		System.out.println();
		int[] num3 = { 3, 5, 7, 9, 11 };
		System.out.println(Arrays.toString(num3));

		int sum = 0;
		for (int n : num3) {
			sum += n;
		}

		System.out.println(sum);

		//問４：int 型の配列 {12, 7, 9, 21, 5, 18} を用意し配列の 最大値と最小値を表示させます。//
		System.out.println();
		int[] num4 = { 12, 7, 9, 21, 5, 18 };
		System.out.println(Arrays.toString(num4));

		int max = num4[0];
		int min = num4[0];

		for (int n : num4) {
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}

		System.out.println(max);
		System.out.println(min);

		//問５：int 型の配列 {1,2,3,4,5} を用意し配列の全ての要素を2倍にし結果を表示させます。//
		System.out.println();
		int[] num5 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(num5));

		for (int n : num5) {
			System.out.println(n * 2);
		}

		//問６：入力した数が 配列に含まれているか を判定し、結果を表示します。//
		System.out.println();
		int[] num6 = { 4, 7, 10, 15, 20 };
		Scanner scanner = new Scanner(System.in);

		int target = scanner.nextInt();

		boolean found = false;
		for (int number : num6) {
			if (number == target) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(target + "は配列に含まれています。");
		} else {
			System.out.println(target + "は配列に含まれていません。");
		}

		//問７：配列のすべての要素を表示させます。//
		System.out.println();
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
		}

		System.out.println();

		//問８：の すべての要素の合計値を表示させます。//
		System.out.println();
		int[][] array1 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		int total = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				total += array1[i][j];
			}
		}

		System.out.println(total);

		//問９：配列内の 最大値と最小値 を求めて表示させます。//
		System.out.println();
		int[][] array2 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };

		int min1 = array2[0][0];
		int max1 = array2[0][0];

		for (int[] row : array2) {
			for (int value : row) {
				if (value < min1) {
					min1 = value;
				}
				if (value > max1) {
					max1 = value;
				}
			}
		}

		System.out.println(min1);
		System.out.println(max1);

		//問１０：内の全ての値を表示させます。//
		System.out.println();
		int[][][] array3 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				for (int k = 0; k < array3[i][j].length; k++) {
					System.out.print(array3[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("");
		}

		scanner.close();

	}

}
