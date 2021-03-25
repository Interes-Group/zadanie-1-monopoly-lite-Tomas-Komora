package sk.stuba.fei.uim.oop.game;


import sk.stuba.fei.uim.oop.chanceCards.Chance;

import java.util.Queue;

public class Game{

    public void monopolyGame(){
        InputIntegers exceptions=new InputIntegers();
        ChanceCards chanceCards=new ChanceCards();

        CornerBuildings cornerBuildings=new CornerBuildings();
        PlayingArea playingArea=new PlayingArea();
        Tiles[] playingArea1 = playingArea.setPlayingArea();
        Players playerses=new Players();
        Players[] players=playerses.setPlayer();
        int numberOfPlayer= players.length;
        Queue<Chance> chanceQueue= chanceCards.chanceCard();

        while(true){
            for(int i=0;i< numberOfPlayer;i++){
                Players player=players[i];

                if(numberOfPlayer==1){
                    System.out.println(player.getName()+" win! ");
                    System.out.println("CONGRATULATUIONS!!!");
                    System.out.println("GAME OVER");
                    return;
                }
                System.out.println("PLAYER :"+player.getName());
                if(player.getRoundsInPrison()!=0){
                    player.setRoundsInPrison(player.getRoundsInPrison()-1);
                    System.out.println(player.getName()+ " stay in prison "+player.getRoundsInPrison()+" rounds \n");
                }
                else{
                    Dice dice=new Dice();
                    int value=dice.dice();
                    player.setPosition((player.getPosition()+value));
                    System.out.println("you threw :"+ value);
                    System.out.println("your position is :"+player.getPosition()%24);
                    System.out.println("you have : "+player.getMoney()+" money");
                    if(player.getPosition()>=24){
                        player.setPosition(player.getPosition()-24);
                        player.setMoney(player.getMoney()+100);
                        System.out.println("you went through the start then you have more 100$ now you have : "+player.getMoney()+" money");
                    }

                        if((playingArea1[player.getPosition()].getName()).equals("Police Station")){  //police station position
                            cornerBuildings.policeStation(player);
                        }
                        else if(playingArea1[player.getPosition()].getName().equals("Prison")){ //prison  position
                            cornerBuildings.prison();
                        }
                        else if(playingArea1[player.getPosition()].getName().equals("Tax paymant")){  //tax pay position
                            cornerBuildings.tax(player);
                        }
                        else if(playingArea1[player.getPosition()].getName().equals("Chance")){//chance
                            System.out.println("you jump in chance tiles");
                            chanceCards.choosenChanceCard(chanceQueue,player);
                            exceptions.nextPush();

                        }

                        else if(playingArea1[player.getPosition()].isBuilding()){ //buildings position
                                Tiles tiles=playingArea1[player.getPosition()];
                            if (((Buildings) tiles).getOwner() ==null){
                                if(player.getMoney()<((Buildings) tiles).getPrice()){
                                    System.out.println("!!!Warning!!! You can not buy new building you dont have enough money");
                                }
                                else {
                                    System.out.println("Do you want buy "+playingArea1[player.getPosition()].getName()+ " for "+((Buildings) tiles).getPrice() +" (yes=1/no=0)");
                                    int answer=exceptions.buyOrNot();
                                    if(answer==1){
                                        player.setMoney(player.getMoney()-((Buildings) tiles).getPrice());
                                        ((Buildings) tiles).setOwner(player.getName());
                                        System.out.println("you buy "+playingArea1[player.getPosition()].getName());
                                    }
                                    else if(answer==0){
                                        System.out.println("you dont buy it ");
                                    }
                                }

                            }
                            else{
                                player.setMoney(player.getMoney()-((Buildings) tiles).getPrice()/2);
                                System.out.println("you are in "+((Buildings) tiles).getOwner()+ " buildings you pay him "+((Buildings) tiles).getPrice()/2);
                                String owner =((Buildings) tiles).getOwner();
                                for (Players item : players) {
                                    if (item.getName().equals(owner)) {
                                        item.setMoney(item.getMoney() + (((Buildings) tiles).getPrice() / 2));
                                    }
                                }
                            }
                        }
                }
                int money = player.getMoney();
                if(money<0){
                    numberOfPlayer=numberOfPlayer-1;
                    System.out.println(player.getName()+ " lose !!! ");
                    for(int helpDeletingOwner= 1; helpDeletingOwner<playingArea1.length;helpDeletingOwner++){
                        if(helpDeletingOwner%3 !=0) {
                            Tiles tiles=playingArea1[helpDeletingOwner];
                            if ((((Buildings) tiles).getOwner())!=null){
                                if((((Buildings) tiles).getOwner()).equals(player.getName())) {
                                    ((Buildings) tiles).setOwner(null);
                                }
                            }
                        }
                    }
                    if (players.length - 1 - i >= 0)
                        System.arraycopy(players, i + 1, players, i, players.length - 1 - i);
                    exceptions.nextPush();
                }
                System.out.println("Next player---------------------------------------------------");

            }
        }
    }
}