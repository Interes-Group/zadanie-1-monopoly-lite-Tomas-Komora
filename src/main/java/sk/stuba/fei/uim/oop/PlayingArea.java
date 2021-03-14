package sk.stuba.fei.uim.oop;

public class PlayingArea {
    Buildings[] setPlayingArea(){
        Buildings[] playingArea= new Buildings[24];
        playingArea[0]=(new Buildings("start",0,0,null));
        playingArea[1]=(new Buildings("Mediterranean Avenue", 1,2000,null));
        playingArea[2]=(new Buildings("Baltic Avenue",2,2000,null));
        playingArea[3]=(new Buildings("Chance",3,0,null));
        playingArea[4]=(new Buildings("Connecticcut Avenue",4,2000,null));
        playingArea[5]=(new Buildings("Vermont Avenue",5,2000,null));
        playingArea[6]=(new Buildings("Prison",6,0,null));
        playingArea[7]=(new Buildings("St. Charles Place",7,2000,null));
        playingArea[8]=(new Buildings("States Avenue",6,2000,null));
        playingArea[9]=(new Buildings("Chance",9,0,null));
        playingArea[10]=(new Buildings("Virginia Avenue",10,2000,null));
        playingArea[11]=(new Buildings("St. James Place",11,2000,null));
        playingArea[12]=(new Buildings("Police Station",12,0,null));
        playingArea[13]=(new Buildings("Tenneessee Avenue",13,2000,null));
        playingArea[14]=(new Buildings("New Yourk Avenue",14,2000,null));
        playingArea[15]=(new Buildings("Chance",15,0,null));
        playingArea[16]=(new Buildings("Kentucky Avenue",16,2000,null));
        playingArea[17]=(new Buildings("Indiana Avenue",17,2000,null));
        playingArea[18]=(new Buildings("Tax paymant",18,1000,null));
        playingArea[19]=(new Buildings("Illinois Avenue",19,2000,null));
        playingArea[20]=(new Buildings("Atlantic Avenue",20,2000,null));
        playingArea[21]=(new Buildings("Chance",21,0,null));
        playingArea[22]=(new Buildings("Ventnov Avenue",22,2000,null));
        playingArea[23]=(new Buildings("Oriental Avenue",23,2000,null));

        return playingArea;
    }
}
