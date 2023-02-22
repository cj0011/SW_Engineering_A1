public class Main {
    public static void main(String[] args) {
        XO_Board b = new XO_Board();
        b.update_board(1,1,'X');
        b.update_board(2,2,'O');
        b.update_board(2,1,'X');
        b.update_board(0,1,'X');
        b.update_board(2,0,'O');
        b.update_board(0,0,'O');
        b.update_board(1,0,'O');

        System.out.println(b.update_board(2,1,'O'));
        System.out.println(b.is_winner('X'));

        b.display_board();
    }
}