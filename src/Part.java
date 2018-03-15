import java.awt.*;
import java.util.Random;

public class Part {

    Random rand = new Random();
    Tile[] part;
    int length;

    public Part(boolean isFive){
        if(isFive){
             part = new Tile[5];
             this.length = 5;
        }
        else if (!isFive){
            part = new Tile[4];
            this.length = 4;
        }
    }

    public void setup(){
        part[0] = new Tile(16 * 30 + 5 * 16, 15, 16, 0);
        for(int i = 1; i < part.length; i++){
            int lastDirection = part[i-1].direction;
            int[] lastPos = part[i-1].getPos();
            int lastX = lastPos[0];
            int lastY = lastPos[1];

            int currentDirection = part[i].direction;
            int[] currentPos = part[i].getPos();
            int currentX = currentPos[0];
            int currentY = currentPos[1];

            if((Math.abs(lastDirection - currentDirection) == 2) || (Math.abs(lastDirection - currentDirection) == 0)) {
                switch (currentDirection) {
                    case 1:
                        part[i] = new Tile(part[i - 1].getXPos() * 30 + 5 * part[i - 1].getXPos(),
                                part[i].getYPos() * 30 + 5 * part[i].getYPos() - 30,
                                part[i - 1].getXPos(),
                                part[i - 1].getYPos() - 1);
                        break;
                    case 2:
                        part[i] = new Tile(part[i - 1].getXPos() * 30 + 5 * part[i - 1].getXPos() + 30,
                                part[i - 1].getYPos() * 30 + 5 * part[i - 1].getYPos(),
                                part[i - 1].getXPos() - 1,
                                part[i - 1].getYPos());
                        break;
                    case 3:
                        part[i] = new Tile(part[i - 1].getXPos() * 30 + 5 * part[i - 1].getXPos() + 30,
                                part[i].getYPos() * 30 + 5 * part[i].getYPos(),
                                part[i - 1].getXPos(),
                                part[i - 1].getYPos() + 1);
                        break;
                    case 4:
                        part[i] = new Tile(part[i - 1].getXPos() * 30 + 5 * part[i - 1].getXPos(),
                                part[i - 1].getYPos() * 30 + 5 * part[i - 1].getYPos() - 30,
                                part[i - 1].getXPos(),
                                part[i - 1].getYPos() + 1);
                        break;
                    default:

                        break;
                }
            }
        }
    }

    public Tile getTile(int i) {
        return part[i];
    }

    public int getLength() {
        return length;
    }
}
