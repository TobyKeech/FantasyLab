import Units.BadGuys.Enemy;
import Units.Players.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnemy {

    Enemy enemy;

    @Before
    public void setUp(){
        enemy = new Enemy("Shadow Keith", 600000 , 20000 );
    }

    @Test
    public void hasName(){
        assertEquals("Shadow Keith", enemy.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(600000, enemy.getHealth());
    }

    @Test
    public void hasGold(){
        assertEquals(20000, enemy.getGold());
    }

}
