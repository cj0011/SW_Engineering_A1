public abstract class Board {
    protected int  n_moves;
    protected int  BOARD_SIZE;
    protected char[][] grid;

    // Set n and book space for n x n grid

    // Return true  if move is valid and put it on board or return false
    abstract boolean update_board (int x, int y, char symbol) ;

    // Returns true if symbol owner wins
    abstract boolean is_winner(char symbol) ;
    // Return true if board status indicates a draw
    abstract boolean is_draw() ;
    // Display the board and the pieces on it
    abstract void display_board();
};

