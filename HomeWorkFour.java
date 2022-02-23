/**
 * Java 1.Home Work #4
 *
 * @author Ivan
 * @version 20.02.2022
 */
import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    
    Random random;
    Scanner scanner;
    char[][] table;
    
    public static void  main(String[] args) {
        new TicTacToe().game();
    }
    
    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }
    
    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin('x')) {
                System.out.println("You win");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw");
                break;
            }
            turnAi();
            printTable();
            if (checkWin('o')) {
                System.out.println("Ai win");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw");
                break;
            }
        }
        System.out.println("Game Over");
        printTable();
    }
    
    void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }

    boolean checkWin(char ch) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) || 
                    (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch))
                    return true;
        /*
        if  (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if  (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if  (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        //
        if  (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if  (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if  (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        */
        if  (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if  (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
