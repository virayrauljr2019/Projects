public class Spell extends PlayerCharacter{



    public Spell(String newName) {
        name = newName;


        spell = new String[8];
        spell[1]= "fireball";
        spell[2]="heal";
        spell[3]="Lightning";
        spell[4]="freeze";
        spell[5]="great heal";
        spell[6]="fire storm";
        spell[7]="armageddon";

        System.out.println(spell);

    }
    }