 public class XO_Board extends Board {
      XO_Board(){
         n_moves = 0 ;
        BOARD_SIZE = 3 ;
        grid = new char[BOARD_SIZE][BOARD_SIZE];
         for (int i = 0 ;i<BOARD_SIZE;++i) {
             for (int j=0;j<BOARD_SIZE;++j){
                 grid[i][j] = '-';
             }
         }

    }

      boolean update_board (int x, int y, char symbol) {
         // check correctness of x y values
          if(x >=0 && x <=2 && y >=0 && y <=2  && grid[x][y] == '-' ){
              grid[x][y] = symbol ;
                return true;
          }
          return false;
      }

      boolean is_winner(char symbol){
                if(grid[0][0] == symbol && grid[0][1] == symbol && grid[0][2] == symbol){
                    return true;
                }
                else if(grid[1][0] == symbol && grid[1][1] == symbol && grid[1][2] == symbol){
                    return true;
                }
                else if (grid[2][0] == symbol && grid[2][1] == symbol && grid[2][2] == symbol) {
                    return true;
                } 
                // here
                else if (grid[0][0] == symbol && grid[1][0] == symbol && grid[2][0] == symbol) {
                    return true;
                }
                else if (grid[2][1] == symbol && grid[1][1] == symbol&& grid[0][1] == symbol) {
                    return true;

                } else if (grid[0][2] == symbol && grid[1][2] == symbol&& grid[2][2] == symbol) {
                    return true;
                }
                // here
                else if (grid[0][0] == symbol && grid[1][1] == symbol&& grid[2][2] == symbol) {
                    return true;

                }
                else if (grid[0][2] == symbol && grid[1][1] == symbol&& grid[2][0] == symbol) {
                    return true;
                }
                else{
                    return false;
                }


      }
       boolean is_draw(){
           return n_moves == 9;
       }


      void display_board(){
          System.out.println("  0 1 2 ");
          for (int i = 0; i < 3; i++) {
              System.out.print(i+"|");
              for (int j = 0; j <3 ; j++) {
                  System.out.print(grid[i][j]);
                  System.out.print("|");
              }
             System.out.println();
          }
      }




 }
