import java.awt.*;

public interface PaintAndMove {

    public void move(GameBoard gb, int maxHeight, int maxWidth);

    public void paint(Graphics g, int color);

    public void setPos(int x, int y);

}
