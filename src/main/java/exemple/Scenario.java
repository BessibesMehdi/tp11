package exemple;

import java.util.ArrayList;
import java.util.List;

import bandeau.Bandeau;


public class Scenario {
    
    private List<EffetRepete> effets;
    
    
    public Scenario() {
        this.effets = new ArrayList<>();
    }
    
    
    public void ajouterEffet(Effet effet, int repetitions) {
        this.effets.add(new EffetRepete(effet, repetitions));
    }
    
    
    public void executer(Bandeau bandeau) {
        for (EffetRepete effectRepete : effets) {
            for (int i = 0; i < effectRepete.getRepetitions(); i++) {
           
                effectRepete.getEffet().appliquer(bandeau);
            }
        }
    }
    
    
   
}
