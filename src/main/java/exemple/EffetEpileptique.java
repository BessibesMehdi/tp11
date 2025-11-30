package exemple;

import java.awt.Color;

import bandeau.Bandeau;


public class EffetEpileptique implements Effet {
    
    
    public void appliquer(Bandeau bandeau) {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                bandeau.setBackground(Color.BLACK);
                bandeau.setForeground(Color.WHITE);
            } else {
                bandeau.setBackground(Color.YELLOW);
                bandeau.setForeground(Color.BLACK);
            }
            bandeau.sleep(100);
        }
    }
    
    @Override
    public String getNom() {
        return "Epileptique";
    }
}
