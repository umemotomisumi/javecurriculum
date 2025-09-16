package kadai7_23;

//課題7_23：自己紹介プログラムを作成します//

//Personクラスに指定の値でフィールドを作成します。//
public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	
	//？this.○○にする理由がよく分かりません。//
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//BMI計算メソッドです//
	public double bmi() {
		return weight / (height * height);
	}
	
	//自己紹介メソッドです//
	public void print() {
		System.out.println("名前は" + this.name + "です"+","+"年は" + this.age + "です"+","+"BMIは" + bmi() + "です");
	}

}
