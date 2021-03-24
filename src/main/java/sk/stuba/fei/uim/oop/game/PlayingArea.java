package sk.stuba.fei.uim.oop.game;

public class PlayingArea {
    Tiles[] setPlayingArea(){
        Tiles[] playingArea= new Tiles[24];
        playingArea[0]=(new Tiles("start",0,false));
        playingArea[1]=(new Buildings("Mediterranean Avenue", 1,50,null,true));
        playingArea[2]=(new Buildings("Baltic Avenue",2,100,null,true));
        playingArea[3]=(new Tiles("Chance",3,false));
        playingArea[4]=(new Buildings("Connecticcut Avenue",4,200,null,true));
        playingArea[5]=(new Buildings("Vermont Avenue",5,250,null,true));
        playingArea[6]=(new Tiles("Prison",6,false));
        playingArea[7]=(new Buildings("St. Charles Place",7,300,null,true));
        playingArea[8]=(new Buildings("States Avenue",6,350,null,true));
        playingArea[9]=(new Tiles("Chance",9,false));
        playingArea[10]=(new Buildings("Virginia Avenue",10,400,null,true));
        playingArea[11]=(new Buildings("St. James Place",11,450,null,true));
        playingArea[12]=(new Tiles("Police Station",12,false));
        playingArea[13]=(new Buildings("Tenneessee Avenue",13,500,null,true));
        playingArea[14]=(new Buildings("New Yourk Avenue",14,600,null,true));
        playingArea[15]=(new Tiles("Chance",15,false));
        playingArea[16]=(new Buildings("Kentucky Avenue",16,550,null,true));
        playingArea[17]=(new Buildings("Indiana Avenue",17,650,null,true));
        playingArea[18]=(new Tiles("Tax paymant",18,false));
        playingArea[19]=(new Buildings("Illinois Avenue",19,700,null,true));
        playingArea[20]=(new Buildings("Atlantic Avenue",20,800,null,true));
        playingArea[21]=(new Tiles("Chance",21,false));
        playingArea[22]=(new Buildings("Ventnov Avenue",22,900,null,true));
        playingArea[23]=(new Buildings("Oriental Avenue",23,1000,null,true));

        return playingArea;
    }
}
