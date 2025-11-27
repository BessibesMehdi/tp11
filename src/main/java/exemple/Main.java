package exemple;

public class Main {
    public static void main(String[] args) {
        bandeau.Bandeau bandeau = new bandeau.Bandeau();
        bandeau.setMessage("KINNOUS");
        Scenario scenario = new Scenario();
        scenario.scenario(bandeau, true, true, true); // Active tous les effets en même temps
    }
}
