package curriculum_D;

public class Character {
	protected String name;
    protected int hp;
    protected int at;
    protected int sp;
    
    //コンストラクタ//
    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
        
    }
    
    public String getName() {
    	return name;
    }
    
    public int getHp() {
		return hp;
	}
    
    public int getAt() {
		return at;
	}
    
    public int getSp() {
		return sp;
	}
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setHp(int hp) {
    	this.hp = hp;
	}
    
    public void setAt(int at) {
    	this.at = at;
	}
    
    public void setSp(int sp) {
    	this.sp = sp;
	}
    
    public void attack(Character target) {
        target.hp -= this.at;
        if (target.hp < 0) {
            target.hp = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s [HP=%d, AT=%d, SP=%d]", name, hp, at, sp);
    }


}
