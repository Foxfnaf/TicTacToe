package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    ArrayList<String> board = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    List<Integer> numberOfBoardPiece = new ArrayList<>();
    boolean win = false;

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
            boardPice--;
        }
        board.set(boardPice, "x");
        win = win();
    }

    public void aiPlayer() {
        int aiAnswear;
        boolean isFieldEmpty = true;

        while (isFieldEmpty) {
            aiAnswear = (int) (Math.random() * 9);
            if (board.get(aiAnswear).equals("o") || board.get(aiAnswear).equals("x")) {
                continue;
            }
            isFieldEmpty = false;
            System.out.println("Ruch ai");
            board.set(aiAnswear, "o");

        }
        win = win();
    }

    public boolean win() {
        if (board.get(0).equals("x") && board.get(1).equals("x") && board.get(2).equals("x")) {
            System.out.println("Wygrałeś");
            return true;
        }

        if (board.get(3).equals("x") && board.get(4).equals("x") && board.get(5).equals("x")) {
            System.out.println("Wygrałeś");
            return true;
        }

        if (board.get(6).equals("x") && board.get(7).equals("x") && board.get(8).equals("x")) {
            System.out.println("Wygrałeś");
            return true;
        }

        if (board.get(0).equals("x") && board.get(3).equals("x") && board.get(6).equals("x")) {
            System.out.println("Wygrałeś");
            return true;
        }

        if (board.get(1).equals("x") && board.get(4).equals("x") && board.get(7).equals("x")) {
            System.out.println("Wygrałeś");
            return true;
        }

        if (board.get(2).equals("x") && board.get(5).equals("x") && board.get(8).equals("x")) {
            System.out.println("Wygrałeś");
            return true;
        }

        if (board.get(0).equals("x") && board.get(4).equals("x") && board.get(8).equals("x")) {
            System.out.println("Wygrałeś");
            return true;
        }

        if (board.get(2).equals("x") && board.get(4).equals("x") && board.get(6).equals("x")) {
            System.out.println("Wygrał");
            return true;
        }

        if (board.get(0).equals("o") && board.get(1).equals("o") && board.get(2).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        if (board.get(3).equals("o") && board.get(4).equals("o") && board.get(5).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        if (board.get(6).equals("o") && board.get(7).equals("o") && board.get(8).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        if (board.get(0).equals("o") && board.get(3).equals("o") && board.get(6).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        if (board.get(1).equals("o") && board.get(4).equals("o") && board.get(7).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        if (board.get(2).equals("o") && board.get(5).equals("o") && board.get(8).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        if (board.get(0).equals("o") && board.get(4).equals("o") && board.get(8).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        if (board.get(2).equals("o") && board.get(4).equals("o") && board.get(6).equals("o")) {
            System.out.println("Wygrał bot");
            return true;
        }

        int count = 0;
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i) == "x" || board.get(i) == "o") {
                count++;
                if (count == 9) {
                    System.out.println("Pat");
                    return true;
                }
            }
        }

        return false;
    }
}

