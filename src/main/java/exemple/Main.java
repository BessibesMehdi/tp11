package exemple;


public class Main {
    public static void main(String[] args) {
    
        bandeau.Bandeau bandeau = new bandeau.Bandeau();
        bandeau.setMessage("ISIS");
        bandeau.sleep(1000);
        
       
        Scenario scenario = new Scenario();
        

        scenario.ajouterEffet(new EffetEpileptique(), 2);        // Clignotant x2
        scenario.ajouterEffet(new EffetZoom(), 1);             // Zoom Progressif x1
        scenario.ajouterEffet(new FiltreAnim(), 1);            // Animation Rotation x1
        
        
        scenario.executer(bandeau);
        
        
        bandeau.sleep(2000);
        bandeau.close();
    }
}
