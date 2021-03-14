package sk.stuba.fei.uim.oop;

public class Buildings {
    private String name;
    private String owner;
    private int price;
    private int position;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    Buildings(String name, int position, int price, String owner){
        this.name=name;
        this.position=position;
        this.price=price;
        this.owner=owner;
    }
}
