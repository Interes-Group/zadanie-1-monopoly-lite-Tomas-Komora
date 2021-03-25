package sk.stuba.fei.uim.oop.game;

public class Tiles {
    protected String name;
    protected int position;
    protected boolean isBuilding;

    public boolean isBuilding() {
        return isBuilding;
    }

    public void setBuilding(boolean building) {
        isBuilding = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    Tiles(String name, int position,boolean isBuilding) {
        this.name = name;
        this.position = position;
        this.isBuilding=isBuilding;
    }
}
