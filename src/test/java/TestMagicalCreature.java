import Units.MythicalCreature;
import Units.Players.Mage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestMagicalCreature {
    MythicalCreature mcDragon;

    @Before
    public void setUp(){
        mcDragon = new MythicalCreature("Colette the Collector of Skulls", 7434, 10 );
    }

    @Test
    public void hasName(){
        assertEquals("Colette the Collector of Skulls", mcDragon.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(7434, mcDragon.getHealth());
    }

    @Test
    public void hasGold(){
        assertEquals(10, mcDragon.getGold());
    }

}
