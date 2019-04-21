package com.Fay;

import static com.Fay.services.RulesService.*;

public class TicTacToe {
    private char[][] field = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
    private Caretaker caretaker = new Caretaker();

    public TicTacToe() {
        printField(this);
    }

    public char[][] getField(){
        return this.field;
    }


    public void putX(int str, int col){
        caretaker.setMemento(this.createMemento());
        if (!finishCheck(this)) {
            if (String.valueOf(field[str][col]).equalsIgnoreCase("_")) {
                field[str][col] = 'x';
                printField(this);
            }
            else System.out.printf("There is value %c already", field[str][col]);}
    }

    public void putO(int str, int col){
        caretaker.setMemento(this.createMemento());
        if (!finishCheck(this)){
            if (String.valueOf(field[str][col]).equalsIgnoreCase("_")) {
                field[str][col] = 'o';
                printField(this);
            }
            else System.out.printf("There is value %c already", field[str][col]);}
    }

    class Memento {
        private char[][] field;

        public char[][] getField() {
            return field;
        }

        public Memento(char[][] field) {
            this.field = field;
        }
    }

    public void setMemento(Memento memento){
        field=memento.getField();
    }

    public Memento createMemento(){
        char[][] backUp = new char[3][3];
        for (int i = 0; i<3; i++)
            System.arraycopy(this.getField()[i], 0, backUp[i],0, 3);
        return new Memento(backUp);
    }

    public void stepBack(){
        this.setMemento(caretaker.getMemento());
        printField(this);
    }
}
