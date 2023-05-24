package Items;

import Units.Unit;

public class Spell extends Item {
    private int hpModifier;

    private int energyCost;
    public Spell(String name, int hpModifier, int energyCost) {
        super(name);
        this.hpModifier = hpModifier;
        this.energyCost = energyCost;
    }

    public int getHpModifier() {
        return hpModifier;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    @Override
    public void useOnTarget(Unit target) {

    }
}
