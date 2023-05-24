import Units.Characters.Mage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMage {
    Mage mage;

    @Before
    public void setUp(){
        mage = new Mage("Sky the Limit", 1000, 33 );
    }

    @Test
    public void hasName(){
        assertEquals("Sky the Limit", mage.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(1000, mage.getHealth());
    }

    @Test
    public void hasGold(){
        assertEquals(33, mage.getGold());
    }

}