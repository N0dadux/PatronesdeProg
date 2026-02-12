package strategypotter;

import strategypotter.Wizard.Wizard;
import strategypotter.spells.ExpectoPatronum;
import strategypotter.spells.Expelliarmus;
import strategypotter.spells.OculusReparo;
import strategypotter.spells.WingardiumLeviosa;

public class Main {
    public static void main(String[] args) {
        Wizard harry = new Wizard("Harry Potter", new ExpectoPatronum());
        Wizard hermione = new Wizard("Hermione Granger", new WingardiumLeviosa());
        Wizard ron = new Wizard("Ron Weasley", new Expelliarmus());

        hermione.spell();
        hermione.setSpell(new OculusReparo());
        hermione.spell();
    }
}