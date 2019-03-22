import java.util.Random;

public class Preist extends PlayerCharacter{



    int Charisma;


    public Preist(String newName) {
        name = newName;
        System.out.println("a Preist name " + name + " has been created");

        Random rand = new Random();
        strength= 7 + (rand.nextInt(6))+1;
        intelligence= 15 + (rand.nextInt(6))+1;
        agility= 8 + (rand.nextInt(6))+1;
        Charisma= 10 + (rand.nextInt(6))+1;
        hp=hpmax=(strength);
        mp= mpmax= (intelligence)+(Charisma*2);
    }

    public void showStats() {
        System.out.printf("%s, a Preist:\n",name);
        System.out.printf("STR: %3d  INT: %3d  AGI: %3d  CON: %3d\n",strength,intelligence,agility,Charisma);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
    }
}