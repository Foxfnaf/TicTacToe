package org.example;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.addBoardToList();
        ticTacToe.displayGameBoard();
        ticTacToe.win();
        while (true){
            ticTacToe.addCross();
            ticTacToe.aiPlayer();
        }
    }
}