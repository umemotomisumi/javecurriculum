package curriculum_B;

public class Qes2 {
	public static void main(String[] args) {
		int score = 75;if (score >= 60)
		System.out.println("合格です！");
		
		//指定の条件分岐を実行しました。//
		
		int age = 25;
		if (age >=20 && age <= 30 ){
		System.out.println("適正年齢です");}
		else {System.out.println("対象外です");}
		
		//年齢が20歳以上30歳以下なら適正年齢ですと、それ以外ば対象外ですとコンソールに表示させます。//
		
		age = 18; 
		if (age >= 20) {System.out.println("成人です");}
		else if (age >=13 && age <= 19) {
		System.out.println("ティーンエイジャーです");}
		else if (age >= 12) {System.out.println("子供です");}
		
		//20歳以上なら成人、13歳以上19歳未満ならティーンエイジャー、12歳以下なら子供とコンソールに表示させます。//
	}

}
