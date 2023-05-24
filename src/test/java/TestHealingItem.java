import Items.HealingItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHealingItem {
    HealingItem healingTool;
    @Before
    public void setUp() {
        this.healingTool = new HealingItem("Keith's Loving Left Hand", 999999999);
    }

    @Test
    public void hasName() {
        assertEquals("Keith's Loving Left Hand", this.healingTool.getName());
    }
    @Test
    public void hasHealingPower() {
        assertEquals(999999999, this.healingTool.getHealingPower());
    }
}
