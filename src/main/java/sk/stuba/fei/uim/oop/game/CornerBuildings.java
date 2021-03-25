package sk.stuba.fei.uim.oop.game;

public class CornerBuildings {
    InputIntegers exceptions=new InputIntegers();
    void prison(){
        System.out.println("you visit prison");
    }

    void policeStation(Players player){
        System.out.println("you go to the prison");
        player.setRoundsInPrison(3);
        exceptions.nextPush();
    }

    void tax(Players player){
        player.setMoney(player.getMoney()-500);
        System.out.println("you pay tax 500$");
    }
}
