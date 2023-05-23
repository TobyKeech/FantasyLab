package Players;

public abstract class Player {
    private String name;
    private int health;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
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
}
