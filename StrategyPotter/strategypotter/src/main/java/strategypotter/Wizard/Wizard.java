package strategypotter.Wizard;

import strategypotter.spells.iSpell;

public class Wizard {
          private String name;
          private iSpell spell;
 
          public Wizard(String name, iSpell spell){
                    this.name = name;
                    this.spell = spell;
          }
          
          public void setSpell(iSpell spell) {
                    this.spell = spell;
          }

          public void spell(){
                    spell.performSpell();
          }
}
