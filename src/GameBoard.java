import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameBoard{

    Tile[][] gb;
    List<Part> gbParts = new ArrayList<>();
    final int xSize = 32;

    public GameBoard(){
        gb = new Tile[xSize][xSize];
        setup();
        gbParts.add(new Part(true));
    }

    public void setup(){
        for(int i = 0; i < xSize; i++){
            for (int j = 0; j < xSize; j++) {
                gb[i][j] = new Tile();
            }
        }
    }

    public void paint(Graphics g){
        for(Part part: gbParts){
            part.setup();
            if(part.getLength() == 5){
                for(int i = 1; i < part.getLength()-1; i++){
                    gb[part.getTile(i).getXPos()][part.getTile(i).getYPos()] = part.getTile(i);
                }
            }
        }

        for(int i = gb.length - 1; i >= 0; i--) {
            for(int j = 0; j < gb.length; j++){
                if (gb[i][j] != null) {
                    gb[i][j].paint(g, gb[i][j].color);
                }
            }
        }
    }

}
