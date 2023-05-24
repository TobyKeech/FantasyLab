import Units.Players.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFighter {
    Fighter fighter;

    @Before
    public void setUp(){
        fighter = new Fighter("Keith the Nonchalant", 1000000000, 50 );
    }

    @Test
    public void hasName(){
        assertEquals("Keith the Nonchalant", fighter.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(1000000000, fighter.getHealth());
    }

    @Test
    public void hasGold(){
        assertEquals(50, fighter.getGold());
    }

}
