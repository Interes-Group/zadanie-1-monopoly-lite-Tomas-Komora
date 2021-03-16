package sk.stuba.fei.uim.oop.chanceCards;

import sk.stuba.fei.uim.oop.game.Players;

public class ChanceCardGoToStart extends Chance {
    public void chanceCardGoToStart(Players player){
        setStatement("you chance card set your position on start");
        player.setPosition(0);
        System.out.println(getStatement());
    }
}
