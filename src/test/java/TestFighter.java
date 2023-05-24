import Items.Item;
import Items.Weapon;
import Units.Characters.Fighter;
import Units.Characters.Healer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestFighter {
    Fighter fighter;
    Weapon weapon;

    Healer enemy;

    @Before
    public void setUp(){
        this.fighter = new Fighter("Keith the Nonchalant", 100, 50, false);
        this.weapon = new Weapon("Keith's Righteous Right Hand", 50);
        this.enemy = new Healer("Shadow Keith", 1000, 500, true );


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
        assertEquals(95, this.fighter.getHealth());
    }

    @Test
    public void canBeHealed(){
        this.fighter.heal(5);
        assertEquals(105, this.fighter.getHealth());
    }

    @Test
    public void canBeHealedBySpell(){
        this.fighter.modifyHealth(5);
        assertEquals(105,this.fighter.getHealth());
    }

    @Test
    public void canBeDamagedBySpell(){
        this.fighter.modifyHealth(-5);
        assertEquals(95,this.fighter.getHealth());
    }
    @Test
    public void canWhackOtherGuy(){
        this.fighter.act(enemy);
        assertEquals(998,this.enemy.getHealth());
    }

    @Test
    public void canWhackWithItem(){
        this.fighter.addItem(weapon);
        this.fighter.setActiveItem(0);
        this.fighter.act(enemy);
        assertEquals(950, this.enemy.getHealth());
    }

    @Test
    public void armourDoesItsJob(){
        this.enemy.act(fighter);
        assertEquals(100, this.fighter.getHealth());
    }

}
