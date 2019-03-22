public class Weapon extends PlayerCharacter{ {

}
    public Weapon(String newName) {
        name = newName;
        weapon = new String[15];
        weapon[1]="dagger";
        weapon[2]="club";
        weapon[3]="mace";
        weapon[4]="short sword";
        weapon[5]="sword";
        weapon[6]="broadsword";
        weapon[7]="halberd";
        weapon[8]="sling";
        weapon[9]="boomerang";
        weapon[10]="flaming oil";
        weapon[11]="bow";
        weapon[12]="crossbow";
        weapon[13]="magicbow";
        weapon[14]="magic axe";
        System.out.println(weapon);



    }
}