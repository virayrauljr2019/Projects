import java.util.Random;
public class Mage extends PlayerCharacter{
    int wisdom;


    public Mage(String newName) {
        name = newName;
        System.out.println("a Mage name " + name + " has been created");

        Random rand = new Random();
        strength= 7 + (rand.nextInt(6))+1;
        intelligence= 15 + (rand.nextInt(6))+1;
        agility= 8 + (rand.nextInt(6))+1;
        wisdom= 10 + (rand.nextInt(6))+1;
        hp=hpmax=(strength);
        mp= mpmax= (intelligence)+(wisdom*2);
    }

    public void showStats() {
        System.out.printf("%s, a Mage:\n",name);
        System.out.printf("STR: %3d  INT: %3d  AGI: %3d  CON: %3d\n",strength,intelligence,agility,wisdom);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
    }
}