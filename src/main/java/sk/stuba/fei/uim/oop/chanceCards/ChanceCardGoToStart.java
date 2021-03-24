package sk.stuba.fei.uim.oop.chanceCards;

import sk.stuba.fei.uim.oop.game.Players;

public class ChanceCardGoToStart extends Chance {
    @Override
    public void chanceCard(Players player) {
        super.chanceCard(player);
        setStatement("you chance card set your position on start");
        player.setPosition(0);
        System.out.println(getStatement());

    }

}
