package exemple;

/**
 * Représente un effet avec son nombre de répétitions
 */
public class EffetRepete {
    private Effet effet;
    private int repetitions;
    
    /**
     * Constructeur
     * @param effet l'effet à répéter
     * @param repetitions le nombre de fois que l'effet est répété
     */
    public EffetRepete(Effet effet, int repetitions) {
        this.effet = effet;
        this.repetitions = repetitions;
    }
    
    /**
     * Retourne l'effet
     * @return l'effet
     */
    public Effet getEffet() {
        return effet;
    }
    
    /**
     * Retourne le nombre de répétitions
     * @return le nombre de répétitions
     */
    public int getRepetitions() {
        return repetitions;
    }
}