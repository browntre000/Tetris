import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    GameBoard gb;
    Part part;
    final int HEIGHT = 800;
    final int WIDTH = 800;


    public Board(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        gb = new GameBoard();
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

    public void startGame(){

    }

    @Override
    public void paintComponent(Graphics g) {
        gb.paint(g);
    }

    public void printSimpleString(String s, int width, int XPos, int YPos, Graphics g2d){
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringLen/2;
        g2d.drawString(s, start + XPos, YPos);
    }


}
