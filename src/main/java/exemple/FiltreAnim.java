package exemple;

import bandeau.Bandeau;

public class FiltreAnim {
    public void FiltreAnim(Bandeau bandeau) {
        for (int i = 0; i < 100; i++) {
            
        //135 DEG
        bandeau.setRotation(Math.PI / 4.0f);
        bandeau.sleep(10);
       
        //180 DEG
        bandeau.setRotation(Math.PI / 1.0f);
        bandeau.sleep(10);
      

        //225 DEG
        bandeau.setRotation(Math.PI / 1.5f);
        bandeau.sleep(10);

        //270 DEG
        bandeau.setRotation(Math.PI / 2.0f);
        bandeau.sleep(10);
        //0 DEG
        bandeau.setRotation(0.0f);
        bandeau.sleep(10);

        //45 DEG
        bandeau.setRotation(Math.PI / 8.0f);
        bandeau.sleep(10);

        //90 DEG
        bandeau.setRotation(Math.PI / 4.0f);
        bandeau.sleep(10);
}



    }
}
