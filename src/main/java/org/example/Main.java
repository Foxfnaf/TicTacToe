package org.example;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.addBoardToList();
        ticTacToe.displayGameBoard();
        while (ticTacToe.win == false){
            ticTacToe.addCross();
            ticTacToe.aiPlayer();
        }
    }
}