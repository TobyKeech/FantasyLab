import Items.Item;
import Items.Weapon;
import Units.Characters.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFighter {
    Fighter fighter;
    Weapon weapon;

    @Before
    public void setUp(){
        this.fighter = new Fighter("Keith the Nonchalant", 100, 50 );
        this.weapon = new Weapon("Keith's Righteous Right Hand", 999999999);

    }

    @Test
    public void hasName(){
        assertEquals("Keith the Nonchalant", fighter.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, fighter.getHealth());
    }

    @Test
    public void hasGold(){
        assertEquals(50, fighter.getGold());
    }

    @Test
    public void canAddWeaponToInventory() {
        this.fighter.addItem((Item) this.weapon);
        assertEquals(this.weapon, this.fighter.getItems().get(0));
    }

    @Test
    public void canEquipWeapon() {
        this.fighter.addItem((Item) this.weapon);
        this.fighter.setActiveItem(0);
        assertEquals(this.weapon, this.fighter.getActiveItem());
    }

    @Test
    public void canBeWounded() {
        this.fighter.wound(10);
        assertEquals(90, this.fighter.getHealth());
    }
}
