import Items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSpell {
    Spell spell;
    @Before
    public void setUp() {
        this.spell = new Spell("Keith's Hypnotic Voice", 999999999, 0);
    }

    @Test
    public void hasName() {
        assertEquals("Keith's Hypnotic Voice", this.spell.getName());
    }
    @Test
    public void hasHealingPower() {
        assertEquals(999999999, this.spell.getHpModifier());
    }
    @Test
    public void hasEnergyCost() {
        assertEquals(0, this.spell.getEnergyCost());
    }
}