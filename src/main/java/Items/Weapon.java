package Items;

import Units.Unit;

public class Weapon extends Item {

    private int attackPower;
    public Weapon(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void useOnTarget(Unit target) {
        target.wound(this.attackPower);
    }
}
