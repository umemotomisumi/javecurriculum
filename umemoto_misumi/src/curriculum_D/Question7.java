package curriculum_D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	// Daemonのステータスをファイルから読み込み//
	
	public static Character loadDaemon(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String name = br.readLine();
		int hp = Integer.parseInt(br.readLine());
		int at = Integer.parseInt(br.readLine());
		int sp = Integer.parseInt(br.readLine());
		br.close();
		return new Character(name, hp, at, sp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		try {
			// プレイヤー作成
			System.out.print("プレイヤーの名前を入力してください: ");
			String playerName = sc.nextLine();
			int playerHp = rand.nextInt(50) + 80; // 80-129
			int playerAt = rand.nextInt(10) + 10; // 10-19
			int playerSp = rand.nextInt(10) + 5; // 5-14
			Character player = new Character(playerName, playerHp, playerAt, playerSp);

			// デーモン読み込み
			//修正箇所です//
			Character daemon = loadDaemon("src/curriculum_D/daemon_status.txt");
			/*Character daemon = loadDaemon("src/curriculum_D/daemon_status.txt");*/

			// ログ出力用
			BufferedWriter logWriter = new BufferedWriter(new FileWriter("src/curriculum_D/battle_log.txt"));
			/*BufferedWriter logWriter = new BufferedWriter(new FileWriter("battle_log.txt"))*/
			logWriter.write("=== バトル開始 ===\n");
			logWriter.write(player + "\n");
			logWriter.write(daemon + "\n\n");

			// 先攻決定
			Character attacker, defender;
			if (player.getSp() > daemon.getSp()) {
				attacker = player;
				defender = daemon;
			} else if (player.getSp() < daemon.getSp()) {
				attacker = daemon;
				defender = player;
			} else {
				if (rand.nextBoolean()) {
					attacker = player;
					defender = daemon;
				} else {
					attacker = daemon;
					defender = player;
				}
			}

			logWriter.write("先攻: " + attacker.getName() + "\n\n");

			// バトルループ
			while (player.getHp() > 0 && daemon.getHp() > 0) {
				attacker.attack(defender);
				logWriter.write(attacker.getName() + " の攻撃！ → " + defender.getName()
						+ " のHP: " + defender.getHp() + "\n");

				// 勝敗判定
				if (defender.getHp() <= 0) {
					logWriter.write("\n" + attacker.getName() + " の勝利！\n");
					break;
				}

				// 攻守交代
				Character temp = attacker;
				attacker = defender;
				defender = temp;
			}

			logWriter.write("=== バトル終了 ===\n");
			logWriter.close();
			System.out.println("バトル結果は battle_log.txt に出力されました。");

		} catch (Exception e) {
			System.out.println("エラーが発生しました: " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
