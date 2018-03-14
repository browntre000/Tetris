import java.awt.*;

public class GameBoard{

    Tile[][] gb;
    final int xSize = 32;

    public GameBoard(){
        gb = new Tile[xSize][xSize];
    }

    public void paint(Graphics g){
        for(int i = gb.length - 1; i >= 0; i--){
            for(int j = 0; j < gb[0].length; j++){
                if(gb[i][j] == null){
                    int nothing =  0;
                }
                else {
                    gb[i][j] = new Tile(25 * (j), 25 * (i) - 5);
                    gb[i][j].paint(g);
                }
            }
        }
    }

}
