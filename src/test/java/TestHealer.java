import Units.Characters.Healer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHealer {

    Healer healer;

    @Before
    public void setUp(){
        healer = new Healer("Mar Vellous", 5000, 2);
    }
    @Test
    public void hasName(){
        assertEquals("Mar Vellous", healer.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(5000, healer.getHealth());
    }

    @Test
    public void hasGold(){
        assertEquals(2, healer.getGold());
    }
}
