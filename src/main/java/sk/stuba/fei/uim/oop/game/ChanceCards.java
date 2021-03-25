package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.chanceCards.*;

import java.util.LinkedList;
import java.util.Queue;

public class ChanceCards {

    Queue<Chance> chanceCard(){
        ChanceCardEarnMoneay earnMoneay=new ChanceCardEarnMoneay();
        ChanceCardGoToStart goToStart=new ChanceCardGoToStart();
        ChanceCardLostMoney lostMoney=new ChanceCardLostMoney();
        ChanceCardGoToPrison goToPrison=new ChanceCardGoToPrison();
        ChanceCardPositionPlus positionPlus=new ChanceCardPositionPlus();

        Queue<Chance> chanceCardsQueue= new LinkedList<>();

        chanceCardsQueue.add(earnMoneay);
        chanceCardsQueue.add(goToStart);
        chanceCardsQueue.add(lostMoney);
        chanceCardsQueue.add(goToPrison);
        chanceCardsQueue.add(positionPlus);

     return chanceCardsQueue;
    }
    void choosenChanceCard(Queue<Chance> chances, Players player){
        Chance tmp =chances.remove();
        tmp.chanceCard(player);
        chances.add(tmp);
    }
}
