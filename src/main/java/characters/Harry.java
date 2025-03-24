
package characters;

import spellbehavior.ISpellBehavior;

public class Harry extends Character {

    public Harry(ISpellBehavior sBehaviorParam) {
        super(sBehaviorParam);
    }
    
    @Override
    public void display(){
    
        System.out.println("Harry utiliza habilidosamente: ");
    
    }
    
}
