package sk.stuba.fei.uim.oop;

public class Players {
    private String name;
    private int money;
    private int roundsInPrison; //ked 1 je v hre ked 2 vo vazaní.
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

    public void setRoundsInPrison(int roundsInPrison) {
        this.roundsInPrison = roundsInPrison;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getRoundsInPrison() {
        return roundsInPrison;
    }

    public int getPosition() {
        return position;
    }
}
