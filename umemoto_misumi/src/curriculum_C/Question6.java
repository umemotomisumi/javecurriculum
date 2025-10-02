package curriculum_C;

public class Question6 {
	public static void main(String[] args) {
		Player player = new Player();
		CPU cpu = new CPU();

		while (true) {
			player.chooseHand();
			cpu.chooseHand();

			//それぞれのクラスの値を取り出す//
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();

			//配列//
			String[] hands = { "グー", "チョキ", "パー" };

			System.out.println("あなたの手: " + hands[playerHand]);
			System.out.println("CPUの手: " + hands[cpuHand]);

			//判定。下記修正箇所になります。あいこと負けバージョンを追加しています//
			if (playerHand == cpuHand) {
				System.out.println("あいこ！ もう一度！");
			}

			else if ((playerHand == 0 && cpuHand == 1) || // グー vs チョキ
					(playerHand == 1 && cpuHand == 2) || // チョキ vs パー
					(playerHand == 2 && cpuHand == 0) // パー vs グー
			) {
				System.out.println("あなたの勝ち！");
				break;
				
			} else {
				System.out.println("あなたの負け... もう一度！");
			}

		}

	}

}
