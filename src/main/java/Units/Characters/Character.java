package Units.Characters;

import Items.Item;
import Units.Unit;

import java.util.ArrayList;

public abstract class Character extends Unit{
    private ArrayList<Item> items;
    private Item activeItem;

    public Character(String name, int health, int gold, boolean isEnemy) {
        super(name, health, gold, isEnemy);
        this.activeItem = null;
        this.items = new ArrayList<Item>();
    }

    public Item getActiveItem() {
        return activeItem;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setActiveItem(int index) {
        setActiveItem(this.getItems().get(index));
    }

    private void setActiveItem(Item item) {
        this.activeItem = item;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public void act(Unit target) {
        if (this.activeItem == null) {
            super.act(target);
        } else {
            this.getActiveItem().useOnTarget(target);
        }
    }

}
