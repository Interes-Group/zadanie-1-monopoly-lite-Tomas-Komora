package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Game {
    Players[] setPlayer(){
        System.out.println("How many players are going to play? (2-8)");
        int NumberOfPlayer = KeyboardInput.readInt();
        Players[] playerList = new Players[NumberOfPlayer];
        for(int i=0; i<NumberOfPlayer;i++){
            System.out.println("Set name for "+i+". player: ");
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
        Buildings[] playingArea1 = playingArea.setPlayingArea();
        Players[] players=setPlayer();
        while(true){
            for(int i=0;i< players.length;i++){
                Players player=players[i];
                System.out.println("PLAYER :"+player.getName());
                if(player.getRoundsInPrison()!=0){
                    player.setRoundsInPrison(player.getRoundsInPrison()-1);
                    System.out.println(player.getName()+ " stay in prison "+player.getRoundsInPrison()+" rounds \n");
                    System.out.println("Next player-----------------------------------");
                }
                else{
                    Dice dice=new Dice();
                    int value=dice.dice();
                    player.setPosition(player.getPosition()+value);
                    System.out.println("you threw :"+ value);
                    System.out.println("your position is :"+player.getPosition());
                    System.out.println("you have : "+player.getMoney()+" money");
                    if(player.getPosition()>24){
                        player.setPosition(player.getPosition()-24);
                        player.setMoney(player.getMoney()+100);
                        System.out.println("you have : "+player.getMoney()+" money");
                    }
                    else{
                        if(player.getPosition()==12){  //police station
                            player.setRoundsInPrison(3);
                            System.out.println("you go to the prison");
                        }
                        else if(player.getPosition()==6){ //prison
                            System.out.println("you visit prison");
                        }
                        else if(player.getPosition()==18){  //tax pay
                            player.setMoney(player.getMoney()-500);
                            System.out.println("you pay tax 500$");
                        }
                        else if(player.getPosition()==1 ||player.getPosition()==2  || player.getPosition()==4 || player.getPosition()==5||
                        player.getPosition()==7 || player.getPosition()==8 || player.getPosition()==10 || player.getPosition()==11 ||
                        player.getPosition()==13||player.getPosition()==14||player.getPosition()==16||player.getPosition()==17||
                        player.getPosition()==19||player.getPosition()==20||player.getPosition()==22||player.getPosition()==23){ //buildings
                            if (playingArea1[player.getPosition()].getOwner()==null){
                                if(player.getMoney()<2001){
                                    System.out.println("!!!Warning!!! you dont have enaught money");
                                }
                                System.out.println("Do you want buy "+playingArea1[player.getPosition()].getName()+ "(yes=1/no=0) write number ");
                                int answer=KeyboardInput.readInt();
                                if(answer==1){
                                    player.setMoney(player.getMoney()-playingArea1[player.getPosition()].getPrice());
                                    playingArea1[player.getPosition()].setOwner(player.getName());
                                    System.out.println("you buy "+playingArea1[player.getPosition()].getName());
                                }
                                else if(answer==0){
                                    System.out.println("you dont buy it ");
                                }
                            }
                            else{
                                String ownerName=playingArea1[player.getPosition()].getOwner();
                                player.setMoney(player.getMoney()-150);
                                System.out.println("you are in "+playingArea1[player.getPosition()].getOwner()+ " buildings you play 150$");
                                String owner =playingArea1[player.getPosition()].getOwner();
                                for(int help=0;help<players.length;help++){
                                    if(players[help].getName()==owner){
                                        players[help].setMoney(players[help].getMoney()+150);
                                    }
                                }
                            }

                        }
                        else if(player.getPosition()==3 || player.getPosition()==9||player.getPosition()==15||player.getPosition()==21){//chance
                            System.out.println("you jump in chance tiles");
                        }
                        System.out.println("Next player-----------------------------------");
                    }


                }if(player.getMoney()<=0){
                    System.out.println(player.getName()+ " lose !!! ");
                }
                if(players.length==1){
                    System.out.println(player.getName()+" win! ");
                    System.out.println("GAME OVER");
                    break;
                }

            }
        }
    }
}