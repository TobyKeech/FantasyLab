package Tools;

public class Spell extends Tool{
    private int hpModifier;

    private int energyCost;
    public Spell(String name, int hpModifier, int energyCost) {
        super(name);
        this.hpModifier = hpModifier;
        this.energyCost = energyCost;
    }
}
