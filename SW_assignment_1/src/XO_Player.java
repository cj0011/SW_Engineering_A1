import java.util.Scanner;
public class XO_Player extends Player{
    Scanner input = new Scanner(System.in);
    XO_Player(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    void get_move(int x, int y) {
        System.out.println("\nPlease enter your move x and y(0 to 2) separated with space  : ");
        x = input.nextInt();
        y = input.nextInt();
    }

    @Override
    char get_symbol() {
        return this.symbol;
    }

    @Override
    String get_name() {
        return this.name;
    }
}
