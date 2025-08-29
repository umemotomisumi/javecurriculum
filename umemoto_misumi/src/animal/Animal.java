package animal;

//問５：Animalクラスを定義しています//
public class Animal {
	
	//動物名、体長、速度の変数を持ち各変数のthisとsetterを作成しています//
    private String name;
    private double length;
    private int speed;     

    public void setName(String name) {
        this.name = name; 
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public int getSpeed() {
        return this.speed;
    }
}
