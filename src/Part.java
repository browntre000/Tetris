import java.awt.*;
import java.util.Random;

public class Part {

    Random rand = new Random();
    Tile[] part = new Tile[];

    public Part(boolean isFive){
        if(isFive){
            for(int i = 0; i < 5; i++){
                part[i] = new Tile((i+16) * 30 + 5 * (i+16), 15);
            }
        }
        else if (!isFive){
            for(int i = 0; i < 4; i++){
                part[i] = new Tile((i+16) * 30 + 5 * (i+16), 15);
            }
        }
    }

    public void paint(Graphics g){
        for(int i = 0; i < part.length; i++){
            if(i == 0){
                part[i] = new Tile((i+16) * 30 + 5 * (i+16), 15);
                part[i].paint(g, part[i].color);
            }
            else{
                int lastDirection = part[i-1].direction;
                int[] lastPos = part[i-1].getPos();
                int lastX = lastPos[0];
                int lastY = lastPos[1];

                int currentDirection = part[i].direction;
                int[] currentPos = part[i].getPos();
                int currentX = currentPos[0];
                int currentY = currentPos[1];

                if((Math.abs(lastDirection - currentDirection) == 2) || (Math.abs(lastDirection - currentDirection) == 0)){
                    switch(currentDirection){
                        case 1:
                            part[i] = new Tile((i+16) * 30 + 5 * (i+16), 15)
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:

                            break;
                    }
                }
            }
        }
    }

}
