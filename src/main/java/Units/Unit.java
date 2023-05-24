package Units;

import java.lang.annotation.Target;

public abstract class Unit{
    private String name;
    private int health;
    private int gold;
    private boolean isEnemy;

    public Unit(String name, int health, int gold, boolean isEnemy){
        this.name = name;
        this.health = health;
        this.gold = gold;
        this.isEnemy = isEnemy;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold(){
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void wound(int damage) {
        this.setHealth(this.getHealth() - damage);
    }

    public void heal(int healingAmount){
        this.setHealth(this.getHealth() + healingAmount);
    }

    public void modifyHealth(int healthModifier){
        this.setHealth(this.getHealth() + healthModifier);
    }

    public void act( Unit target){
        target.wound(2);
    }
}
