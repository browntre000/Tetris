import java.awt.*;

public class Sprite implements PaintAndMove {

    int xSize;
    int[] pos = new int[2];

    public Sprite(){
        this.pos[0] = 0;
        this.pos[1] = 0;
        this.xSize = 10;
    }

    public Sprite(int x, int y, int xSize){
        this.pos[0] = x;
        this.pos[1] = y;
        this.xSize = xSize;
    }

    public void setPos(int x, int y){
        this.pos[0] = x - xSize/2;
        this.pos[1] = y - xSize/2;
    }

    public int[] getPos(){
        return pos;
    }

    public void paint(Graphics g){
        g.fillRect(pos[0], pos[1], xSize, xSize);
    }

    public void move(GameBoard gb, int maxWidth, int maxHeight){

    }

}
