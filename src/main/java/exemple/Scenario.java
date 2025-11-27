package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Scenario {
    public void scenario(Bandeau bandeau, boolean epileptique, boolean zoom, boolean anim) {
        // Paramètres pour chaque effet
        int iterations = 100;
        int[] fontSizes = {20, 30, 40, 50, 60, 50, 40, 30};
        double[] rotations = {0, Math.PI/4, Math.PI/2, Math.PI, 3*Math.PI/2, 2*Math.PI};
        
        for (int i = 0; i < iterations; i++) {
            // Effet épileptique
            if (epileptique) {
                if (i % 2 == 0) {
                    bandeau.setBackground(Color.BLACK);
                    bandeau.setForeground(Color.WHITE);
                } else {
                    bandeau.setBackground(Color.YELLOW);
                    bandeau.setForeground(Color.BLACK);
                }
            }
            // Zoom
            if (zoom) {
                int fontSize = fontSizes[i % fontSizes.length];
                bandeau.setFont(new Font("Arial", Font.BOLD, fontSize));
            }
            // Animation
            if (anim) {
                double rotation = rotations[i % rotations.length];
                bandeau.setRotation(rotation);
            }
            // Petite pause
            bandeau.sleep(100);
        }
    }
}
