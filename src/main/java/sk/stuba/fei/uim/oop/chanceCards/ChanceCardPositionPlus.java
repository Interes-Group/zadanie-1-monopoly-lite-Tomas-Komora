package sk.stuba.fei.uim.oop.chanceCards;

import sk.stuba.fei.uim.oop.game.Players;

public class ChanceCardPositionPlus extends Chance {
    @Override
    public void chanceCard(Players player) {
        super.chanceCard(player);
        setStatement("you chance card send you 2 position next");
        player.setPosition(player.getPosition()+2);
        System.out.println(getStatement());

    }

   // public void chanceCardPositionPlus(Players player){
    //    setStatement("you chance card send you 2 position next");
     //   player.setPosition(player.getPosition()+2);
      //  System.out.println(getStatement());
    //}
}
