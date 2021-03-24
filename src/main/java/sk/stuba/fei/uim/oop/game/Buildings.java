package sk.stuba.fei.uim.oop.game;

public class Buildings extends Tiles {

    private String owner;
    private int price;



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    Buildings(String name, int position, int price, String owner,boolean isBuilding){
        super(name,position,isBuilding);
        this.price=price;
        this.owner=owner;
    }
}
