
package characters;

import spellbehavior.ISpellBehavior;

public class Hermione extends Character {

    public Hermione(ISpellBehavior sBehaviorParam) {
        super(sBehaviorParam);
    }
    
    @Override
    public void display(){
    
        System.out.println("Hermione utiliza habilidosamente: ");
    
    }
    
}
