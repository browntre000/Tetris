import java.awt.*;
import java.util.Random;

public class Tile extends Sprite {

    Random rand = new Random();
    boolean isBonus;
    int color, direction;
    int xPos = 0, yPos = 0;

    public Tile(int x, int y, int xPos, int yPos){
        super(x, y);
        int direction = rand.nextInt(4);

        int random = rand.nextInt(100)+1;
        if(random <= 30){
            isBonus = true;
            color = 0;
        }
        else{
            isBonus = false;
        }

        if(random <= 10){
            color = 1;
        }
        else if(random <= 20){
            color = 2;
        }
        else if(random <= 30){
            color = 3;
        }
        else if(random <= 40){
            color = 4;
        }
        else if(random <= 50){
            color = 5;
        }
        else if(random <= 60){
            color = 6;
        }
        else if(random <= 70){
            color = 7;
        }
        else if(random <= 80){
            color = 8;
        }
        else if(random <= 90){
            color = 9;
        }
        else if(random <= 100){
            color = 10;
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
