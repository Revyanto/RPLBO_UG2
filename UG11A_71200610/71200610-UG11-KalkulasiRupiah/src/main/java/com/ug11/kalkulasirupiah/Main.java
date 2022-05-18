package com.ug11.kalkulasirupiah;
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        String text;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan text: ");
        text = myObj.nextLine();
        char[] ch = text.toCharArray();
        StringBuilder biaya1 = new StringBuilder();
        StringBuilder biaya2 = new StringBuilder();
        for(char c : ch) {
            if (Character.isDigit(c)) {
                biaya1.append(c);
            }
        }
        System.out.println("Rincian biaya; "+"Rp"+"+"+"Rp");
    }
}
