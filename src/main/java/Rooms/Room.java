package Rooms;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Character> enemies;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Character> getEnemies() {
        return enemies;
    }
}
