package org.example;

public class Start {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.addBoardToList();
        ticTacToe.displayGameBoard();
        while (!ticTacToe.win) {
            ticTacToe.addCross();
            ticTacToe.aiPlayer();
            ticTacToe.displayGameBoard();
        }
    }
}