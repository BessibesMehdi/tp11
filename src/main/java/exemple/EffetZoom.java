package exemple;

import java.awt.Font;

import bandeau.Bandeau;

/**
 * Effet de zoom progressif et régressif
 */
public class EffetZoom implements Effet {
    
    @Override
    public void appliquer(Bandeau bandeau) {
        // Zoom avant (20 -> 60)
        for (int i = 20; i <= 60; i += 5) {
            bandeau.setFont(new Font("Arial", Font.BOLD, i));
            bandeau.sleep(50);
        }
        // Zoom arrière (60 -> 20)
        for (int i = 60; i >= 20; i -= 5) {
            bandeau.setFont(new Font("Arial", Font.BOLD, i));
            bandeau.sleep(50);
        }
    }
    
    @Override
    public String getNom() {
        return "Zoom";
    }
}
