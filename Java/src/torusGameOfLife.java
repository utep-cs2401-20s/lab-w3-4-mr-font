public class torusGameOfLife extends GameOfLife {

    //Default constructor
    public torusGameOfLife(){

    }

    public void setTorusSize(int size){

        this.size = size;
    }

    public void setTorusBoard (int[][] Board){

        this.Board = Board;
        this.Previous = Board;
    }

@Override
    public int neighbors(int r, int c){

      //use mod(%)
      int count = 0;

     // if(r > 0 || r == size - 1 || c == 0 || c < size - 2){

          for(int i = r -1; i < r + 2; i++) {
              for (int j = c - 1; j < c + 2; j++) {

                  if( j < 0 || j > size - 1){
                      j = r%c;
                      if(Previous[i][j] == 1){
                          count++ ;
                      }
                  }

                  if(i < 0 || i > size - 1 || j < 0 || j > size - 1){

                      if(i < 0 && j < 0 ){
                          int k = i%Previous.length;
                          int l = j%Previous[0].length;
                          if(Previous[k][l] == 1){
                              count++ ;
                          }
                      }

                      if(j < 0 || j > Previous[0].length){
                          int l = j%Previous[0].length;
                          if(Previous[i][l] == 1){
                              count++;
                          }
                      }

                      if(i <0 || i > Previous.length){
                          int k = i%Previous.length;
                          if(Previous[k][j] == 1){
                              count++ ;
                          }
                      }
                  }



                  if (i == r && j == c) {
                      continue;
                  }


                  if(Previous[i][j] == 1){
                      count++ ;
                  }
              }
          //}
      }

    return count;


    }
}
