package Units.Characters;

public class Fighter extends Character {

    private int armour;
    public Fighter(String name, int health, int gold, boolean isEnemy) {
        super(name, health, gold, isEnemy);
        this.armour = 5;
    }

    public void wound(int damage){
       if (this.armour <= damage ){
           this.setHealth(this.getHealth() - damage + this.armour);
       }
    }
}
