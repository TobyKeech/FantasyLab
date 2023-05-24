package Rooms;

import Units.BadGuys.Enemy;
import Units.Unit;

import java.util.ArrayList;

public class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
