import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        int val= 5;
        Random num= new Random();
        Fighter player = new Fighter("Raul");
        Fighter player2= new Fighter( "Doug");
        Mage player3= new Mage("Nico");
        Mage player4= new Mage("eric");
        Preist player5= new Preist("dylan");
        Preist player6 = new Preist("Waluigi");
        Paladin player7= new Paladin("Nick");
        Paladin player8= new Paladin("Mario");


player.showStats();
player2.showStats();
player3.showStats();
player4.showStats();
        player5.showStats();
        player6.showStats();
        player7.showStats();
        player8.showStats();



        ArrayList<PlayerCharacter> players= new ArrayList<PlayerCharacter>();
        players.add(player);
        players.add(player3);
        players.add(player5);
        players.add(player7);

        System.out.println(players.size());


    }
}
