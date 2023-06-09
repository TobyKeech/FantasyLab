import Items.Weapon;
import Units.Characters.Healer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeapon {
    Weapon weapon;
    Healer enemy;
    @Before
    public void setUp() {
        this.weapon = new Weapon("Keith's Righteous Right Hand", 100000);
        this.enemy = new Healer("Shadow Keith", 600000 , 20000, true );
    }

    @Test
    public void hasName() {
        assertEquals("Keith's Righteous Right Hand", this.weapon.getName());
    }
    @Test
    public void hasAttackPower() {
        assertEquals(100000, this.weapon.getAttackPower());
    }

    @Test
    public void canBeUsedOnTarget() {
        this.weapon.useOnTarget(this.enemy);
        assertEquals(500000, this.enemy.getHealth());
    }
}
