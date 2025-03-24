
package characters;

import spellbehavior.ISpellBehavior;

public class Character {
    
    ISpellBehavior sBehavior;
    
    public Character(ISpellBehavior sBehaviorParam){        
        
        this.sBehavior = sBehaviorParam;
    }
    
    public void performSpell(){
        
        sBehavior.spell();
        
    }
    
    public void display(){}
}
