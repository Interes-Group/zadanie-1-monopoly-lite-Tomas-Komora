package sk.stuba.fei.uim.oop;

public class Game {
    void setPlayer(){
        System.out.println("How many players are going to play? (2-8)");
        int NumberOfPlayer = KeyboardInput.readInt();
        Players[] playerList = new Players[NumberOfPlayer];
        for(int i=0; i<NumberOfPlayer;i++){
            System.out.println("Set name for "+i+". player: ");
            Players player = new Players();
            player.setName(KeyboardInput.readString());
            player.setMoney(15000);
            player.setPosition(0);
            player.setStatus(1);
            playerList[i]=player;
        }
    }

    void setBuildings(){



    }



}
