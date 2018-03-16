import java.awt.*;
import java.util.Random;

public class Tile extends Sprite {

    Random rand = new Random();
    boolean isBonus;
    final int color = rand.nextInt(10);
    final int direction = rand.nextInt(4);
    int xPos = 0, yPos = 0;

    public Tile(){
        int nothing = 0;
    }

    public Tile(int x, int y, int xPos, int yPos){
        super(x, y);

        int random = rand.nextInt(90)+1;
        if(random <= 30){
            isBonus = true;
        }
        else{
            isBonus = false;
        }

        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void paint(Graphics g){
        super.paint(g, this.color);
    }

    public void moveDown(){
        yPos += 1;
    }

    public void moveLeft(){
        xPos -= 1;
    }

    public void moveRight(){
        xPos += 1;
    }

}
