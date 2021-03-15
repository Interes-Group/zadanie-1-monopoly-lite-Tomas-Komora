package sk.stuba.fei.uim.oop;

public class Tiles {
    protected String name;
    protected int position;

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

    Tiles(String name, int position) {
        this.name = name;
        this.position = position;
    }
}
