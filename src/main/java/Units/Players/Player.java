package Units.Players;

import Units.Unit;

import javax.tools.Tool;
import java.util.ArrayList;

public abstract class Player extends Unit{

    private ArrayList<Tool> tools;
    private Tool activeTool;
    public Player(String name, int health, int gold) {
        super(name, health, gold);
        this.activeTool = null;
        this.tools = new ArrayList<>();
    }
}
