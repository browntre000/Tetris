public class GameBoard{

    Tile[][] gb;

    public GameBoard(){
        gb = new Tile[32][40];
    }

    public void paint(){
        for(int i = gb.length - 1; i >= 0; i--){
            for(int j = 0; j < gb.length[0]; j++){
                gb[i][j].paint();
            }
        }
    }

}
