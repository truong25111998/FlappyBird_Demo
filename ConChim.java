
package gameflappybird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ConChim {
    private static int y = 200;
    private static int x = 100;
    private BufferedImage bird;
    
    public static int getY() {
        return y;
    }


    public static int getX() {
        return x;
    }

    
    public void paint(Graphics g){
        try {
            //        g.setColor(Color.red);
//        g.fillRect(x, y, 45, 45);
bird = ImageIO.read(new File("C:\\Users\\Admin\\Pictures\\img\\bird.png"));
g.drawImage(bird, x, y, null);
        } catch (IOException ex) {
            Logger.getLogger(ConChim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void tangY(){
        y++;
    }
    public void giamY(){
        y = y - 30;
    }
}
