package sk.stuba.fei.uim.oop;

public class ChanceCardPositionPlus extends Chance{
    public void chanceCardPositionPlus(Players player){
        setStatement("you chance card send you 2 position next");
        player.setPosition(player.getPosition()+2);
        System.out.println(getStatement());
    }
}
