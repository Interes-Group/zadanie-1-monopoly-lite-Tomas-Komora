package sk.stuba.fei.uim.oop;

public class Prison {
    public int prison(int roundsInPrison){
        System.out.print("zostava "+roundsInPrison+ " dní vo väzení \n");
        roundsInPrison=roundsInPrison-1;
        if (roundsInPrison==0){
            System.out.println("vyšiel si z väzania \n");
        }
        return roundsInPrison;
    }
}
