package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Animation {

       public static void main(String[] args) {
        new Animation().anim();
    }
    Bandeau bandeau =new Bandeau();
    Font font = bandeau.getFont();
        Color back = bandeau.getBackground();
        Color fore = bandeau.getForeground();
    
    
    //INTRO
    public void anim() {
   
    bandeau.setBackground(Color.GREEN);
    bandeau.setMessage("Amir");
        bandeau.sleep(1000);
        bandeau.setMessage("Arras");
        bandeau.sleep(1000);
        bandeau.setMessage("Fartas");
        bandeau.setFont(new Font("Monospaced", Font.BOLD, 25));
        bandeau.sleep(1000);
        bandeau.setMessage("Ki yekel");
        bandeau.setFont(new Font("SansSerif", Font.PLAIN, 18));
        bandeau.sleep(1000);
        
   

   //// ZOOOOOOOOOOOOOOOOOOOOOOOOM
 
    bandeau.setBackground(Color.PINK);
    bandeau.setMessage("FIL GLACE");
        bandeau.sleep(1000);
        bandeau.setMessage("TA7T AL BALASS");
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.sleep(1000);
   

   //TOURNE
   
;bandeau.setFont(new Font("Courier new", Font.PLAIN, 20));{
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);
bandeau.sleep(10);
bandeau.setBackground(Color.BLACK);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.GREEN);
bandeau.sleep(100);
bandeau.setBackground(Color.BLUE);
bandeau.sleep(100);
bandeau.setBackground(Color.ORANGE);
bandeau.sleep(100);
bandeau.setBackground(Color.RED);
bandeau.sleep(100);
bandeau.setBackground(Color.YELLOW);
bandeau.sleep(100);

bandeau.setFont(new Font("Courier new", Font.PLAIN, 20));
        bandeau.setMessage("WA ");
        bandeau.sleep(1000);
        bandeau.setMessage("I KHALASS");
        bandeau.setRotation(Math.PI / 1.0f);
        bandeau.sleep(1000);
        bandeau.setRotation(0.0f);
   }

    

  
    bandeau.setRotation(Math.PI / 4.0f);
    bandeau.setMessage("FI KARASS");
        bandeau.sleep(1000);
        bandeau.setRotation(0.0f);

        bandeau.setRotation(Math.PI / 4.0f);
        bandeau.setBackground(Color.CYAN);
        bandeau.setMessage("M3A CHKOUN?");
        bandeau.sleep(1000);
        bandeau.setRotation(0.0f);

        bandeau.setRotation(Math.PI / 4.0f);
        bandeau.setForeground(Color.MAGENTA);
        bandeau.sleep(1000);
        bandeau.setRotation(0.0f);

        bandeau.setRotation(Math.PI / 4.0f);
        bandeau.setFont(new Font("Arial", Font.BOLD, 20));
        bandeau.setForeground(Color.GREEN);
        bandeau.setMessage("M3A L'3ASSAS");
        bandeau.sleep(3000);
        bandeau.setRotation(0.0f);
        
   }
}
