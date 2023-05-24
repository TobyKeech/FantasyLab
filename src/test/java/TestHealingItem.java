import Items.HealingItem;
import Units.Characters.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHealingItem {
    HealingItem healingTool;
    Fighter fighter;
    @Before
    public void setUp() {
        this.healingTool = new HealingItem("Keith's Loving Left Hand", 100);
        this.fighter = new Fighter("Keith the Nonchalant", 100, 50 );

    }

    @Test
    public void hasName() {
        assertEquals("Keith's Loving Left Hand", this.healingTool.getName());
    }
    @Test
    public void hasHealingPower() {
        assertEquals(100, this.healingTool.getHealingPower());
    }

    @Test
    public void canBeUsedOnUnit(){
        this.healingTool.useOnTarget(fighter);
        assertEquals(200, this.fighter.getHealth());
    }
}
