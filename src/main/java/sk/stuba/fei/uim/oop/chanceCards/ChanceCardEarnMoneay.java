package sk.stuba.fei.uim.oop.chanceCards;

import sk.stuba.fei.uim.oop.game.Players;

public class ChanceCardEarnMoneay extends Chance {
    @Override
    public void chanceCard(Players player) {
        setStatement("you chance card gift you 200$");
        player.setMoney(player.getMoney()+200);
        System.out.println(getStatement());

    }


}
