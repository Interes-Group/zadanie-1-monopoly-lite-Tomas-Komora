package sk.stuba.fei.uim.oop.game;


public class Game{

    public void monopolyGame(){
        InputIntegers exceptions=new InputIntegers();
        PlayingArea playingArea=new PlayingArea();
        Tiles[] playingArea1 = playingArea.setPlayingArea();
        Players playerses=new Players();
        Players[] players=playerses.setPlayer();
        int numberOfPlayer= players.length;
        ChanceCards chance = new ChanceCards();
        int positionChanceCard=0;
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

                        if(player.getPosition()==12){  //police station position
                            player.setRoundsInPrison(3);
                            System.out.println("you go to the prison");
                            exceptions.nextPush();
                        }
                        else if(player.getPosition()==6){ //prison  position
                            System.out.println("you visit prison");
                        }
                        else if(player.getPosition()==18){  //tax pay position
                            player.setMoney(player.getMoney()-500);
                            System.out.println("you pay tax 500$");
                        }
                        else if(player.getPosition()==3 || player.getPosition()==9||player.getPosition()==15||player.getPosition()==21){//chance
                            System.out.println("you jump in chance tiles");
                            positionChanceCard=chance.chanceCard(positionChanceCard,player);
                            exceptions.nextPush();

                        }
                        else if(player.getPosition()%3!=0){ //buildings position
                                Tiles tiles=playingArea1[player.getPosition()];
                            if (((Buildings) tiles).getOwner() ==null){
                                if(player.getMoney()<((Buildings) tiles).getPrice()){
                                    System.out.println("!!!Warning!!! You can not buy new building you dont have enaught monay");
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
                                player.setMoney(player.getMoney()-((Buildings) tiles).getPrice());
                                System.out.println("you are in "+((Buildings) tiles).getOwner()+ " buildings you pay him "+((Buildings) tiles).getPrice());
                                String owner =((Buildings) tiles).getOwner();
                                for(int helpPayPerStay=0;helpPayPerStay<players.length;helpPayPerStay++){
                                    if(players[helpPayPerStay].getName().equals(owner)){
                                        players[helpPayPerStay].setMoney(players[helpPayPerStay].getMoney()+((Buildings) tiles).getPrice());
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
                    for(int helpDeletingPlayer = i; helpDeletingPlayer < (players.length -1); helpDeletingPlayer++){
                        players[helpDeletingPlayer] = players[helpDeletingPlayer + 1];

                    }
                    exceptions.nextPush();
                }
                System.out.println("Next player---------------------------------------------------");

            }
        }
    }
}