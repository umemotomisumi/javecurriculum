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

			if ((playerHand == 0 && cpuHand == 1) ||
					(playerHand == 1 && cpuHand == 2) ||
					(playerHand == 2 && cpuHand == 0)) {
				System.out.println("あなたの勝ち！");

				break;
			}

		}

	}

}
