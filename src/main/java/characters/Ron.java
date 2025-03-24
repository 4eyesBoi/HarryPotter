
package characters;

import spellbehavior.ISpellBehavior;

public class Ron extends Character {
    
    public Ron(ISpellBehavior sBehaviorParam) {
        super(sBehaviorParam);
    }
    
    @Override
    public void display(){
    
        System.out.println("Ron utiliza habilidosamente: ");
    
    }
    
}
