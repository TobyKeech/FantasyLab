package Tools;

public class Weapon extends Tool{

    private int attackPower;
    public Weapon(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }
}
