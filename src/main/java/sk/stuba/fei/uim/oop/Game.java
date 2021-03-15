package sk.stuba.fei.uim.oop;


import java.util.Queue;

public class Game{
    Players[] setPlayer(){
        System.out.println("How many players are going to play? (2-8)");
        int NumberOfPlayer = KeyboardInput.readInt();
        Players[] playerList = new Players[NumberOfPlayer];
        for(int i=0; i<NumberOfPlayer;i++){
            System.out.println("Set name for "+(i+1)+". player: ");
            Players player = new Players();
            player.setName(KeyboardInput.readString());
            player.setMoney(5000);
            player.setPosition(0);
            player.setRoundsInPrison(0);
            playerList[i]=player;
        }
        return playerList;
    }

    void gameOfTrones(){
        PlayingArea playingArea=new PlayingArea();
        Tiles[] playingArea1 = playingArea.setPlayingArea();
        Players[] players=setPlayer();
        int numberOfPlayer= players.length;
        ChanceCards chance = new ChanceCards();
        int positionChanceCard=0;
        while(true){
            for(int i=0;i< players.length;i++){
                Players player=players[i];
                if(numberOfPlayer==1){
                    System.out.println(player.getName()+" win! ");
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

                        }
                        else if(player.getPosition()==1 ||player.getPosition()==2  || player.getPosition()==4 || player.getPosition()==5||
                        player.getPosition()==7 || player.getPosition()==8 || player.getPosition()==10 || player.getPosition()==11 ||
                        player.getPosition()==13||player.getPosition()==14||player.getPosition()==16||player.getPosition()==17||
                        player.getPosition()==19||player.getPosition()==20||player.getPosition()==22||player.getPosition()==23){ //buildings position
                                Tiles tiles=playingArea1[player.getPosition()];
                            if (((Buildings) tiles).getOwner() ==null){
                                if(player.getMoney()<((Buildings) tiles).getPrice()){
                                    System.out.println("!!!Warning!!! You can not buy new building you dont have enaught monay");
                                }
                                else {
                                    System.out.println("Do you want buy "+playingArea1[player.getPosition()].getName()+ " for "+((Buildings) tiles).getPrice() +" (yes=1/no=0)");
                                    int answer=KeyboardInput.readInt();
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
                               // String ownerName=((Buildings) tiles).getOwner();
                                player.setMoney(player.getMoney()-150);
                                System.out.println("you are in "+((Buildings) tiles).getOwner()+ " buildings you play 150$");
                                String owner =((Buildings) tiles).getOwner();
                                for(int helpPayPerStay=0;helpPayPerStay<players.length;helpPayPerStay++){
                                    if(players[helpPayPerStay].getName().equals(owner)){
                                        players[helpPayPerStay].setMoney(players[helpPayPerStay].getMoney()+150);
                                    }
                                }
                            }
                        }
                }if(player.getMoney()<0){
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
                        numberOfPlayer=numberOfPlayer-1;
                    }
                }
                System.out.println("Next player---------------------------------------------------");

            }
        }
    }
}