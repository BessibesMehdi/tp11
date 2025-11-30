package exemple;

import bandeau.Bandeau;

/**
 * Interface définissant un effet d'animation
 */
public interface Effet {
    /**
     * Applique l'effet sur le bandeau
     * @param bandeau le bandeau sur lequel appliquer l'effet
     */
    void appliquer(Bandeau bandeau);
    
    /**
     * Retourne le nom de l'effet
     * @return le nom de l'effet
     */
    String getNom();
}
