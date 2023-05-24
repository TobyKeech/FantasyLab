import Items.Spell;
import Units.Characters.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSpell {
    Spell spell;

    Fighter fighter;
    @Before
    public void setUp() {
        this.spell = new Spell("Keith's Hypnotic Voice", 50, 0);
        this.fighter = new Fighter("Keith the Nonchalant", 100, 50);
    }


    @Test
    public void hasName() {
        assertEquals("Keith's Hypnotic Voice", this.spell.getName());
    }
    @Test
    public void hasHealingPower() {
        assertEquals(50, this.spell.getHpModifier());
    }
    @Test
    public void hasEnergyCost() {
        assertEquals(0, this.spell.getEnergyCost());
    }

    @Test
    public void canBeUsedOnUnit(){
        this.spell.useOnTarget(fighter);
        assertEquals(150,this.fighter.getHealth());
    }
}