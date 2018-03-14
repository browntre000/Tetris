import java.awt.*;
import java.util.Random;

public class Tile extends Sprite {

    Random rand = new Random();
    boolean isBonus;
    int color, direction;

    public Tile(int x, int y){
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
    }

    public void paint(Graphics g){
        super.paint(g, this.color);

    }

}
