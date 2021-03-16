package sk.stuba.fei.uim.oop.game;

public class PlayingArea {
    Tiles[] setPlayingArea(){
        Tiles[] playingArea= new Tiles[24];
        playingArea[0]=(new Tiles("start",0));
        playingArea[1]=(new Buildings("Mediterranean Avenue", 1,50,null));
        playingArea[2]=(new Buildings("Baltic Avenue",2,100,null));
        playingArea[3]=(new Tiles("Chance",3));
        playingArea[4]=(new Buildings("Connecticcut Avenue",4,200,null));
        playingArea[5]=(new Buildings("Vermont Avenue",5,250,null));
        playingArea[6]=(new Tiles("Prison",6));
        playingArea[7]=(new Buildings("St. Charles Place",7,300,null));
        playingArea[8]=(new Buildings("States Avenue",6,350,null));
        playingArea[9]=(new Tiles("Chance",9));
        playingArea[10]=(new Buildings("Virginia Avenue",10,400,null));
        playingArea[11]=(new Buildings("St. James Place",11,450,null));
        playingArea[12]=(new Tiles("Police Station",12));
        playingArea[13]=(new Buildings("Tenneessee Avenue",13,500,null));
        playingArea[14]=(new Buildings("New Yourk Avenue",14,600,null));
        playingArea[15]=(new Tiles("Chance",15));
        playingArea[16]=(new Buildings("Kentucky Avenue",16,550,null));
        playingArea[17]=(new Buildings("Indiana Avenue",17,650,null));
        playingArea[18]=(new Tiles("Tax paymant",18));
        playingArea[19]=(new Buildings("Illinois Avenue",19,700,null));
        playingArea[20]=(new Buildings("Atlantic Avenue",20,800,null));
        playingArea[21]=(new Tiles("Chance",21));
        playingArea[22]=(new Buildings("Ventnov Avenue",22,900,null));
        playingArea[23]=(new Buildings("Oriental Avenue",23,1000,null));

        return playingArea;
    }
}
