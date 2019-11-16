package gameflappybird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel implements Runnable {

    private ConChim conChim = new ConChim();
    private OngNuoc ongNuoc = new OngNuoc();
    private DiemSo diemSo = new DiemSo();
    private KiemTra kt = new KiemTra();
    private BufferedImage bg, nendat;
    Thread th;

    public Panel() {
        th = new Thread(this);
        th.start();

    }

    @Override
    public void paint(Graphics g) {

        try {
            //        g.setColor(Color.cyan);
//        g.fillRect(0, 0, getWidth(), getHeight());
            bg = ImageIO.read(new File("C:\\Users\\Admin\\Pictures\\img\\b.png"));
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(bg, 0, 0, null);
        ongNuoc.paint(g);
        try {
            //
//        g.setColor(Color.green);
//        g.fillRect(0, 400, getWidth(), getHeight());
//
//        g.setColor(Color.orange);
//        g.fillRect(0, 410, getWidth(), getHeight());
nendat = ImageIO.read(new File("C:\\Users\\Admin\\Pictures\\img\\ground.png"));
        } catch (IOException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(nendat, 0, 400, getWidth(), getHeight(), null);
        conChim.paint(g);

        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score" + diemSo.getDiem(), 10, 20);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            ongNuoc.giamX();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }

            ongNuoc.lapLaiX();
            conChim.tangY();
            if (kt.chet() == true) {
                th.stop();
                
            }
            
            diemSo.congDiem();

        }
    }

}
