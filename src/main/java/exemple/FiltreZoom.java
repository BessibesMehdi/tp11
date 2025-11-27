package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class FiltreZoom {
   
        
    
    //ZOOM*0.25
    public void FiltreZoom(Bandeau bandeau) {
      
        for (int i = 0; i < 10; i++) {
            for (int j = 5; j < 60; j += 5) {
                bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                bandeau.sleep(10);
            }
        
    
    //ZOOM*0.5
     
        
            for (int j = 5; j < 60; j += 5) {
                bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                bandeau.sleep(10);
            }
        
    
    //ZOOM*1
    
        for (int j = 5; j < 60; j += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
            bandeau.sleep(10);
        }
    
    //ZOOM*1.5
   
        
            for (int j = 5; j < 60; j += 5) {
                bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                bandeau.sleep(10);
            }
        }
    
    //ZOOM*2
    
       
            for (int j = 5; j < 60; j += 5) {
                bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                bandeau.sleep(10);
            }
        }
    }





