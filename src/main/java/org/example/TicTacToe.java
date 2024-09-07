package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    ArrayList<String> board = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    List<Integer> numberOfBoardPiece = new ArrayList<>();

    public void displayGameBoard() {
        for (int i = 0; i < board.size(); i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.println();
            }
            if (board.get(i) == "empty board piece") {
                System.out.print(numberOfBoardPiece.get(i));
                System.out.print("[ ] ");
            } else {
                System.out.print(numberOfBoardPiece.get(i));
                System.out.print("[" + board.get(i) + "] ");
            }
        }

        System.out.println();
    }

    public List<String> addBoardToList() {
        for (int i = 1; i <= 9; i++) {
            board.add("empty board piece");
            numberOfBoardPiece.add(i);
        }
        return board;
    }

    public void addCross() {
        System.out.println("wybierz gdzie chcesz postawić krzyżyk");
        int boardPice = scanner.nextInt();
        boardPice--;
        while (board.get(boardPice) == "o" || board.get(boardPice) == "x") {
            System.out.println("Nie możesz postawić w tym miejscu");
            System.out.println("wybierz gdzie chcesz postawić krzyżyk");
            boardPice = scanner.nextInt();
        }
        board.set(boardPice, "x");
        displayGameBoard();
    }

    public int aiPlayer() {
        int aiAnswear = (int) (Math.random() * 9);

        while (board.get(aiAnswear) == "o" || board.get(aiAnswear) == "x") {
            aiAnswear = (int) (Math.random() * 9);
            System.out.println("Ruch ai");
            board.set(aiAnswear, "o");
        }
        displayGameBoard();
        return aiAnswear;
    }

    public void win() {

    }
}
