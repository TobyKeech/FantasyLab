package Units;

public abstract class Unit {
    private String name;
    private int health;
    private int gold;

    public Unit(String name, int health, int gold){
        this.name = name;
        this.health = health;
        this.gold = gold;
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
}
