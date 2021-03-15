package sk.stuba.fei.uim.oop;

public class ChanceCardGoToPrison extends Chance{
    public void chanceCarGotToPrison(Players player){
        setStatement("you go to the prison");
        player.setPosition(12);
        System.out.println(getStatement());
    }
}
