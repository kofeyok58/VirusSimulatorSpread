package com.virus.model;

public class Cell {
    public double S,E,I,R,D;
    public final int N = 100; //население ячейки

    public  Cell(){
        S=N-1;
        I=1;
        E=R=D=0;

    }

    public void reset(){
        S=N-1;
        I=1;
        E=R=D=0;
    }
    public int getTotakInfected(){return(int)(E+I);}
    public int getTotalDead(){return (int) D;}

}
