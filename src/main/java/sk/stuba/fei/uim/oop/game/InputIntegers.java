package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.KeyboardInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputIntegers{
    int numberOfPlayer() {
        int numberOfPlayers;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                numberOfPlayers = scanner.nextInt();
                if (numberOfPlayers >= 2 && numberOfPlayers <= 8)
                    break;
                System.out.println("you write less or more player... set player between 2-8");
            } else {
                System.out.println("you dont write number! try again");
                scanner.next();
            }
        }
        return numberOfPlayers;
    }

    int buyOrNot(){
        Scanner scanner=new Scanner(System.in);
        int answer;
        while(true){
            if(scanner.hasNextInt()) {
                answer=scanner.nextInt();
                if(answer==1 || answer==0)
                    break;
                System.out.println("you dont write 1 or 0 try again! Do you want buy it? 1/0");
            }else {
                System.out.println("you dont write 1 or 0 try again! Do you want buy it? 1/0");
                scanner.next();
            }
            }
        return answer;
    }


}
