package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class EffetEpileptique {
    public void effetEpileptique(Bandeau bandeau) {
        for (int i = 0; i < 100; i++) {
            // Fond noir, texte blanc
            bandeau.setBackground(Color.BLACK);
            bandeau.setFont(new Font("Arial", Font.BOLD, 20));
            bandeau.setForeground(Color.WHITE);
            bandeau.sleep(10);

            // Fond jaune, texte noir
            bandeau.setBackground(Color.YELLOW);
            bandeau.setFont(new Font("Arial", Font.BOLD, 20));
            bandeau.setForeground(Color.BLACK);
            bandeau.sleep(10);
        }
    }
}


