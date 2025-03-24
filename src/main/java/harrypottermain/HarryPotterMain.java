
package harrypottermain;

import characters.Harry;
import characters.Hermione;
import characters.Ron;
import spellbehavior.ExpectoPatronum;
import spellbehavior.Expelliarmus;
import spellbehavior.OculusReparo;
import spellbehavior.WingardiumLeviosa;

public class HarryPotterMain {
    
    public static void main(String[] args) {
        
        ExpectoPatronum ep = new ExpectoPatronum();
        Expelliarmus e = new Expelliarmus();
        OculusReparo o = new OculusReparo();
        WingardiumLeviosa w = new WingardiumLeviosa();
        
        Harry h = new Harry(ep);
        Hermione he = new Hermione(w);
        Ron r = new Ron(e);
        Hermione he_o = new Hermione(o);
        
        System.out.println("---------- Harry ----------");
        h.display();
        h.performSpell();
        System.out.println("---------- Hermione ----------");
        he.display();
        he.performSpell();
        System.out.println("---------- Ron ----------");
        r.display();
        r.performSpell();
        System.out.println("---------- Hermione aprende oculus ----------");
        he_o.display();
        he_o.performSpell();
        System.out.println("---------- END ----------");
        
        
        
    }
    
}
