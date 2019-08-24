package pl.moj.tictac.io;


import java.util.Scanner;

public class Scan {

    Scanner scan = new Scanner(System.in);

    public Integer getFieldNumber() {
        Integer fieldNo = null;
        try {
            fieldNo = scan.nextInt();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Number out of range 1-9");
        }
        return fieldNo;


    }

}

