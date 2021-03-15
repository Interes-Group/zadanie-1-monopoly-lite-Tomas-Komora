package sk.stuba.fei.uim.oop;

public class ChanceCardEarnMoneay extends Chance {
    public void chanceCardEarnMoney(Players player){
        setStatement("you chance card gift you 200$");
        player.setMoney(player.getMoney()+200);
        System.out.println(getStatement());
    }


}
