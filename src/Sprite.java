import java.awt.*;

public class Sprite implements PaintAndMove {

    final int xSize = 30;
    int[] pos = new int[2];

    public Sprite(){
        this.pos[0] = 0;
        this.pos[1] = 0;
    }

    public Sprite(int x, int y){
        this.pos[0] = x;
        this.pos[1] = y;
    }

    public void setPos(int x, int y){
        this.pos[0] = x - xSize/2;
        this.pos[1] = y - xSize/2;
    }

    public int[] getPos(){
        return pos;
    }

    public void paint(Graphics g, int color){
        switch (color){
            case 0:
                g.setColor(Color.yellow);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 1:
                g.setColor(Color.red);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 2:
                g.setColor(Color.green);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 3:
                g.setColor(Color.orange);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 4:
                g.setColor(Color.cyan);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 5:
                g.setColor(Color.blue);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 6:
                g.setColor(Color.pink);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 7:
                g.setColor(new Color(128,0,128));
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 8:
                g.setColor(Color.magenta);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 9:
                g.setColor(Color.white);
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
            case 10:
                g.setColor(new Color(51,204,255));
                g.fillRect(pos[0], pos[1], xSize, xSize);
                break;
        }
    }

    public void move(GameBoard gb, int maxWidth, int maxHeight){

    }

}
