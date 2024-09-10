package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    ArrayList<String> board = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    List<Integer> numberOfBoardPiece = new ArrayList<>();
    boolean gameStatus = false;

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
        gameStatus = checkGameStatus();
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
        gameStatus = checkGameStatus();
    }

    public boolean checkGameStatus() {
        int count = 0;
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).equals("x")) {
                count++;
                if (count == 3){
                    System.out.println("Wygrałeś");
                    return true;
                }
            }
        }

        count = 0;
        for (int i = 0; i < board.size(); i += 3) {
            if (board.get(i).equals("x")) {
                count++;
                if (count == 3){
                    System.out.println("Wygrałeś");
                    return true;
                }
            }
        }

        count = 0;
        for (int i = 0; i < board.size(); i += 4) {
            if (board.get(i).equals("x")) {
                count++;
                if (count == 3){
                    System.out.println("Wygrałeś");
                    return true;
                }
            }
        }

        count = 0;
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).equals("o")) {
                count++;
                if (count == 3){
                    System.out.println("Wygrało ai");
                    return true;
                }
            }
        }

        count = 0;
        for (int i = 0; i < board.size(); i += 3) {
            if (board.get(i).equals("o")) {
                count++;
                if (count == 3){
                    System.out.println("Wygrało ai");
                    return true;
                }
            }
        }

        count = 0;
        for (int i = 0; i < board.size(); i += 4) {
            if (board.get(i).equals("o")) {
                count++;
                if (count == 3){
                    System.out.println("Wygrało ai");
                    return true;
                }
            }
        }

        return false;
    }
}

