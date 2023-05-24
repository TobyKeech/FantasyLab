package Items;

import Units.Unit;

public class HealingItem extends Item {
    private int healingPower;

    public HealingItem(String name, int healingPower) {
        super(name);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    @Override
    public void useOnTarget(Unit target) {

    }
}
