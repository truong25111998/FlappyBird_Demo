
package gameflappybird;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class GUI extends JFrame{
    private Panel pp = new Panel();
    private ConChim conChim = new ConChim();
    public GUI(){
        setSize(500, 500);
        setTitle("Game Flappy Bird");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(400, 150);
        
        this.add(pp);
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                conChim.giamY();
            }
            
});
//        //addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                conChim.giamY();
//            }
//            
//});
        
    }
}
