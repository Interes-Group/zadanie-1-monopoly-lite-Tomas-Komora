package sk.stuba.fei.uim.oop;

public class Assignment1 extends Dice{
    public static void main(String[] args) {
       // Dice hod= new Dice();
       // int cislo = hod.dice();
       // System.out.print(cislo);
        int pocetdnivovazani = 6;
        for(int i=1;i<=3;i++) {
            Prison vazenie = new Prison();

            pocetdnivovazani=vazenie.prison(pocetdnivovazani);
        }
    }


}
