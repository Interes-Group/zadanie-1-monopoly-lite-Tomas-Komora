package sk.stuba.fei.uim.oop.chanceCards;

import sk.stuba.fei.uim.oop.game.Players;

public class ChanceCardGoToPrison extends Chance {
    public void chanceCarGotToPrison(Players player){
        setStatement("you go to the prison");
        player.setPosition(12);
        System.out.println(getStatement());
    }
}
