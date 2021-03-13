package sk.stuba.fei.uim.oop;

public class Players {
    private String name;
    private int money;
    private int status; //ked 1 je v hre ked 2 vo vazaní.
    private int position;

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
