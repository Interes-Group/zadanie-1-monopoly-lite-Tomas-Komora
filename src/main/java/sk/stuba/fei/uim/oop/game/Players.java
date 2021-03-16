package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.KeyboardInput;

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


    Players[] setPlayer(){
        InputIntegers exceptions=new InputIntegers();
        System.out.println("How many players are going to play? (2-8)");
        int numberOfPlayer = exceptions.numberOfPlayer();

        Players[] playerList = new Players[numberOfPlayer];
        for(int i=0; i<numberOfPlayer;i++){
            System.out.println("Set name for "+(i+1)+". player: ");
            Players player = new Players();
            player.setName(KeyboardInput.readString());
            player.setMoney(5000);
            player.setPosition(0);
            player.setRoundsInPrison(0);
            playerList[i]=player;
        }
        return playerList;
    }
}
