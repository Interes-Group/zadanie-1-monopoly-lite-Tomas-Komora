package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.chanceCards.*;

public class ChanceCards {

    int chanceCard(int positionCards, Players player){
        ChanceCardEarnMoneay earnMoneay=new ChanceCardEarnMoneay();
        ChanceCardGoToStart goToStart=new ChanceCardGoToStart();
        ChanceCardLostMoney lostMoney=new ChanceCardLostMoney();
        ChanceCardGoToPrison goToPrison=new ChanceCardGoToPrison();
        ChanceCardPositionPlus positionPlus=new ChanceCardPositionPlus();
        if(positionCards==5)
            positionCards=0;

        if(positionCards==0){
         earnMoneay.chanceCardEarnMoney(player);
        }
        else if(positionCards==1){
            goToPrison.chanceCarGotToPrison(player);
        }
        else if(positionCards==2){
            lostMoney.chanceCardLostMoney(player);
        }
        else if(positionCards==3){
            goToStart.chanceCardGoToStart(player);
        }
        else if(positionCards==4){
            positionPlus.chanceCardPositionPlus(player);
        }

        positionCards++;
     return positionCards;
    }
}
