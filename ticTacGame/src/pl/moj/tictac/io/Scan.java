package pl.moj.tictac.io;


import java.util.Scanner;

public class Scan {

    Scanner scan = new Scanner(System.in);

    public Integer getFieldNumber(){
        return scan.nextInt();
    }
}
