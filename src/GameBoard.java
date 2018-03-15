import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameBoard{

    Tile[][] gb;
    List<Part> gbParts = new ArrayList<>();
    final int xSize = 32;

    public GameBoard(){
        gb = new Tile[xSize][xSize];
        gbParts.add(new Part(true));
    }

    public void paint(Graphics g){
        for(Part part: gbParts){
            part.setup();
            if(part.getLength() == 5){
                for(int i = 0; i < part.getLength(); i++){
                    gb[part.getTile(i).getXPos()][part.getTile(i).getYPos()] = part.getTile(i);
                }
            }
        }

        for(int i = gb.length - 1; i >= 0; i++) {
            for(int j = 0; j < gb.length; j++){
                gb[i][j].paint(g, gb[i][j].color);
            }
        }
    }

}
