package com.Fay.services;

import com.Fay.TicTacToe;

public class RulesService {
    public static boolean charEquals(char a, char b){
        if (String.valueOf(a).equalsIgnoreCase(String.valueOf(b)))
                return true;
        else return false;
    }

    public static boolean nullCheck(char a){
        return String.valueOf(a).equalsIgnoreCase("_");
    }

    public static boolean finishCheck(TicTacToe toe){
        char[][] field = toe.getField();
        boolean res;
        int c = 0;
        for (int i = 0; i<3; i++)
            if (stringCheck(field[i])) c++;
        res = c>0;
        if (res||colCheck(field)||diagCheck(field))
            System.out.println("gameOver, someone won");
        return (res||colCheck(field)||diagCheck(field));
    }

    public static boolean stringCheck(char[] field){
        if (nullCheck(field[0])||nullCheck(field[1])||nullCheck(field[2]))
            return false;
        else return charEquals(field[0], field[1]) && charEquals(field[1], field[2]);
        }

    public static boolean colCheck(char[][] field){
        int c = 0;
        for (int i=0;i<3;i++) {
            if (nullCheck(field[0][i]) || nullCheck(field[1][i]) || nullCheck(field[2][i]))
                return false;
            if (charEquals(field[0][i], field[1][i]) && charEquals(field[1][i], field[2][i]))
                c++;
        }
        return c > 0;
    }

    public static boolean diagCheck(char[][] field){
        int c = 0;
        if (nullCheck(field[0][0])||nullCheck(field[1][1])||nullCheck(field[2][2]))
            return false;
        if (charEquals(field[0][0],field[1][1])&&charEquals(field[1][1],field[2][2]))
            c++;
        if (nullCheck(field[0][2])||nullCheck(field[2][0]))
            return false;
        if (charEquals(field[0][2],field[1][1])&&charEquals(field[2][0],field[0][2]))
            c++;
        return c > 0;
    }


    public static void printField(TicTacToe toe){
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++)
                if (j!=2)
                    System.out.print(toe.getField()[i][j]+" ");
                else System.out.print(toe.getField()[i][j]);
            System.out.println();
        }
        System.out.println();
        }

}
