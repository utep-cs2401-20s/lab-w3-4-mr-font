

public class GameOfLife {

    //Attributes
    int size;
    int[][] Board = new int[size][size];
    int[][] Previous = new int[size][size];

    //Constructors

    //Default constructor
    public GameOfLife(){

    }

    public void GameOfLife(int S){

        this.size = S;
    }

    public void GameOfLife(int[][] B){


        //save the size to size
        //initialize your board, and previous
        //this.size = size;
        this.Board = B;
        this.Previous = B;
    }

    public int[][] getBoard(){

        return Board;
    }

    public void oneStep(){
        int[][] temp = new int[size][size];

        //copy Board into temp
        for(int i = 0; i < Board.length; i++){
            for(int j = 0; j < Board[i].length; j++){
                temp[i][j] = Board[i][j];
            }
        }

        for(int i = 0; i < Board.length; i++){
            for(int j = 0; j < Board[0].length; j++){

                //if(Board[i][j] == 1 && neighbors(i,j) == 4 ){
               //     continue;
                //}

                if(neighbors(i,j) <= 1 ){
                    Board[i][j] = 0;
                }

                if(neighbors(i,j) <= 3){
                    Board[i][j] = 1;
                }

                if(neighbors(i,j) >= 4){
                    Board[i][j] = 0;
                }

                if(Board[i][j] == 0 && neighbors(i,j) == 3){
                    Board[i][j] = 1;
                }
                //Board[i][j] = neighbors(i, j);
            }
        }

        

        //copy temp into previous
        for(int i = 0; i < Previous.length; i++){
            for(int j = 0; j < Previous[i].length; j++){
                Previous[i][j] = temp[i][j];
            }
    }

    }

    public int neighbors(int r, int c){
        //count neighbors

        int count = 0;

      // if(r > 0 || r < size - 2 || c > 0 || c < size - 2){
           for(int i = r -1; i < r + 2; i++) {
               for (int j = c - 1; j < c + 2; j++) {

                   if(i < 0 || i > size - 1 || j < 0 || c > size - 1){
                       continue;
                   }

                   if (i == r && j == c) {
                     continue;
                   }


                   if(Previous[i][j] == 1){
                       count++ ;
                   }
               }
           }
        //}



        return count;
    }

    public void evolution(int n){

        while (n > 0){
            oneStep();
            n --;
        }
    }

    //public public static void main(String[] args) {

   // public  MyMainClass(int[][] a) {
        ////initialize previous to size
        //nested for loop: copying from Board to previous
        //initialize your board to size
        //
   //}
    //}
}