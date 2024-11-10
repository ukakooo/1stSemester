import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        char board[][] = {
                { '-', '-', '-' },
                { '-', '-', '-' },
                { '-', '-', '-' }
        };

        // Declare Variables and Scanner
        boolean isPlayerX = true;
        boolean hasWinner = false;
        boolean isDraw = false;
        Scanner sigmaSkibidi = new Scanner(System.in);

        while (!hasWinner && !isDraw) {
            // Display the board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            // Ask for player input
            System.out.println((isPlayerX ? "Player X" : "Player O") + ", enter row (0, 1, or 2): ");
            int row = sigmaSkibidi.nextInt();
            System.out.println("Enter column (0, 1, or 2): ");
            int col = sigmaSkibidi.nextInt();

            // Checks for input validation by checking if the player inputs a row or column either
            // more than 2/less than 0 or no
            if (col > 2 || row > 2 || col < 0 || row < 0) {
                System.out.println("\nPlease input a valid output!");
                System.out.println();
                continue;
            }

            // Place the mark on the board if the cell is empty
            if (board[row][col] == '-') {
                board[row][col] = isPlayerX ? 'X' : 'O';
                isPlayerX = !isPlayerX;
            } else {
                System.out.println("Cell already taken! Try again.");
                continue;
            }

            // Check for a winner
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                    hasWinner = true;
                }
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                    hasWinner = true;
                }
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
                hasWinner = true;
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
                hasWinner = true;
            }

            // Check for draw
            isDraw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        isDraw = false;
                    }
                }
            }

        }
        // Display the final board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // game result
        //Checks whther the winner is Player X or Player 0 by checking the isPlayerX variable
        char winner;
        if (!isPlayerX) {
            winner = 'X';
        } else {
            winner = 'O';
            
        }
        if (hasWinner) {
            System.out.println("We have a winner! Congratulations to Player " + winner + "! ");
        } else if (isDraw) {
            System.out.println("It's a draw!");
        }
    }
}
