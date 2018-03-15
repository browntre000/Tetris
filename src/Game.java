import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame implements KeyListener {

    Board board;

    public Game(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setFocusable(true);
        setTitle("Tetris");
        board = new Board();
        add(board);
        pack();
        setLocationRelativeTo(null);
        addKeyListener(this);
        board.startGame();
    }

    public static void main(String[] args){
        new Game();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e){

    }
}
