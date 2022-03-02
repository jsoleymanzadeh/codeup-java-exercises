import util.Input;

public class ArraysPractice3 {
    private static void displayBoard(String[][] gameBoard) {
        int rowId = 1;
        System.out.println("\n\t A\t B\t C");
        for (String[] row : gameBoard) {
            System.out.printf("%s\t", rowId);
            for (String space : row) {
                System.out.printf("%s\t", space);
            }
            System.out.println();
            rowId++;
        }
    }

    private static boolean checkWinner(String[][] gameBoard, String playerMark) {
        int diagonal1Tracker = 0;
        int diagonal2Tracker = 0;
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][i].equals(playerMark)) {
                diagonal1Tracker++;
                if (diagonal1Tracker == 3) {
                    for (int z = 0; z < 3; z++) {
                        gameBoard[z][z] = gameBoard[z][z].replace('-', '*');
                    }
                    displayBoard(gameBoard);
                    return true;
                }
            }
            if (gameBoard[i][2 - i].equals(playerMark)) {
                diagonal2Tracker++;
                if (diagonal2Tracker == 3) {
                    for (int z = 0; z < 3; z++) {
                        gameBoard[z][2 - z] = gameBoard[z][2 - z].replace('-', '*');
                    }
                    displayBoard(gameBoard);
                    return true;
                }
            }
            int rowTracker = 0;
            int colTracker = 0;
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j].equals(playerMark)) {
                    rowTracker++;
                    if (rowTracker == 3) {
                        for (int z = 0; z < 3; z++) {
                            gameBoard[i][z] = gameBoard[i][z].replace('-', '*');
                        }
                        displayBoard(gameBoard);
                        return true;
                    }
                }
                if (gameBoard[j][i].equals(playerMark)) {
                    colTracker++;
                    if (colTracker == 3) {
                        for (int z = 0; z < 3; z++) {
                            gameBoard[z][i] = gameBoard[z][i].replace('-', '*');
                        }
                        displayBoard(gameBoard);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void playerTurn(String[][] gameBoard, boolean player1) {
        Input playerInput = new Input();
        displayBoard(gameBoard);
        String playerMark;
        boolean player1Next;
        String winMessage;
        if (player1) {
            playerMark = "-X-";
            player1Next = false;
            winMessage = "Player 1 wins!";
            System.out.print("Player 1: ");
        } else {
            playerMark = "-O-";
            player1Next = true;
            winMessage = "Player 2 wins!";
            System.out.print("Player 2: ");
        }
        int row = -1;
        int col = -1;
        while (row == -1) {
            String playerMove = playerInput.getString();
            switch (playerMove.charAt(0)) {
                case '1':
                    row = 0;
                    break;
                case '2':
                    row = 1;
                    break;
                case '3':
                    row = 2;
                    break;
            }
            switch (playerMove.charAt(1)) {
                case 'A':
                    col = 0;
                    break;
                case 'B':
                    col = 1;
                    break;
                case 'C':
                    col = 2;
                    break;
            }
            if (row == -1 || col == -1 || gameBoard[row][col].charAt(1) != '-') {
                row = -1;
                col = -1;
                System.out.print("Try again: ");
            }
        }
        gameBoard[row][col] = playerMark;
        if (checkWinner(gameBoard, playerMark)) {
            System.out.print(winMessage);
            return;
        }
        playerTurn(gameBoard, player1Next);
    }

    public static void main(String[] args) {
        Input input = new Input();
        do {
            String[][] gameBoard = {{"---", "---", "---"}, {"---", "---", "---"}, {"---", "---", "---"}};
            playerTurn(gameBoard, true);
        } while (input.yesNo("\n\nPlay again? [y/N] "));
        System.out.println("Exiting...");
    }
}