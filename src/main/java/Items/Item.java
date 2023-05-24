package Items;

public abstract class Item implements IUseOnTarget{
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
