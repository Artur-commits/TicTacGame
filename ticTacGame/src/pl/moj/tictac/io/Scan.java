package pl.moj.tictac.io;


import java.util.Scanner;

public class Scan {

    Scanner scan = new Scanner(System.in);

    public Integer getFieldNumber() {
        try {
            return scan.nextInt();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Wprowadzony znak nie jest liczba całkowitą");
        } finally {
            return scan.nextInt();

        }

    }

}

