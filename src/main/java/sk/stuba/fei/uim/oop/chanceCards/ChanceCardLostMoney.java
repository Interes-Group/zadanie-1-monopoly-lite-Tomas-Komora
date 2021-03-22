package sk.stuba.fei.uim.oop.chanceCards;

import sk.stuba.fei.uim.oop.game.Players;

public class ChanceCardLostMoney extends Chance {
    @Override
    public void chanceCard(Players player) {
        super.chanceCard(player);
        setStatement("you chance card take you 200$");
        player.setMoney(player.getMoney()-200);
        System.out.println(getStatement());
    }

   // public void chanceCardLostMoney(Players player){
    //    setStatement("you chance card take you 200$");
     //   player.setMoney(player.getMoney()-200);
     //   System.out.println(getStatement());
   // }
}
