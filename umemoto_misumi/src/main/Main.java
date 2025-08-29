package main;

//問５：Animalクラスインポートし出力の処理を行っています//
import animal.Animal;
//問４：Greeting クラスをインポートして sayHello() を実行しています。//
import greeting.Greeting;

public class Main {
	public static void main(String[] args) {
		Greeting.sayHello();

		System.out.println();//答えと答えの間の改行//

		Animal animal = new Animal();

		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}
