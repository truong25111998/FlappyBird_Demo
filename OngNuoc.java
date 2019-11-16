package gameflappybird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class OngNuoc extends JPanel {

    private static int x1 = 500;
    private static int x2 = x1 + 200;
    private static int x3 = x2 + 200;
    private static int x4 = x3 + 200;
    private static int h1, h2, h3;
    private static boolean bl1 = false;
    private static boolean bl2 = false;
    private static boolean bl3 = false;
    private BufferedImage ongtren, ongduoi;

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getX4() {
        return x4;
    }

    public static int getH1() {
        return h1;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

    
    public void ngaunhienheight() {
        Random rd = new Random();
        if (bl1 == false) {
            h1 = rd.nextInt(200);
            bl1 = true;
        }
        if (bl2 == false) {
            h2 = rd.nextInt(200);
            bl2 = true;
        }
        if (bl3 == false) {
            h3 = rd.nextInt(200);
            bl3 = true;
        }

    }

    @Override
    public void paint(Graphics g) {
        
        try {
            ngaunhienheight();
            ongtren = ImageIO.read(new File("C:\\Users\\Admin\\Pictures\\img\\up.png"));
            ongduoi = ImageIO.read(new File("C:\\Users\\Admin\\Pictures\\img\\down.png"));
            
            g.drawImage(ongtren, x1, 0, 55, h1, null);
            g.drawImage(ongduoi, x1, h1+100, 55, 500, null);
            g.drawImage(ongtren, x2, 0, 55, h2, null);
            g.drawImage(ongduoi, x2, h2+100, 55, 500, null);
            g.drawImage(ongtren, x3, 0, 55, h1, null);
            g.drawImage(ongduoi, x3, h3+100, 55, 500, null);
            
//        g.setColor(Color.green);
//        g.fillRect(x1, 0, 55, h1);
//        //ong nuoc duoi
//        g.setColor(Color.green);
//        g.fillRect(x1, h1 + 100, 55, 500);
//
//        g.setColor(Color.green);
//        g.fillRect(x2, 0, 55, h2);
//        //ong nuoc duoi
//        g.setColor(Color.green);
//        g.fillRect(x2, h2 + 100, 55, 500);
//
//        g.setColor(Color.green);
//        g.fillRect(x3, 0, 55, h3);
//        //ong nuoc duoi
//        g.setColor(Color.green);
//        g.fillRect(x3, h3 + 100, 55, 500);
        } catch (IOException ex) {
            Logger.getLogger(OngNuoc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void giamX() {
        x1--;
        x2--;
        x3--;
        
    }

    public void lapLaiX() {
        if (x1 == -55) {
            x1 = 500;
            bl1 = false;
        }
        if (x2 == -55) {
            x2 = 500;
            bl2 = false;
        }
        if (x3 == -55) {
            x3 = 500;
            bl3 = false;
        }


    }
}
