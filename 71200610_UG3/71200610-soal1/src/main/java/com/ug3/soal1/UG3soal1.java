package com.ug3.soal1;
import java.util.Scanner;
public class UG3soal1 {
    public static void main(String args[]){
        System.out.println("====================Data Product====================");
        System.out.println("Masukkan Data Product Makanan Anda");
        Scanner makanan = new Scanner(System.in);
        System.out.println("Nama Makanan: ");
        String nama = makanan.nextLine();
        System.out.println("Tanggal Kadaluarsa: ");
        String tanggal = makanan.nextLine();
        System.out.println("Jumlah (quantity): ");
        int jumlah = makanan.nextInt();
        System.out.println("Berat (gram): ");
        float berat = makanan.nextFloat();

        System.out.println("====================Data Product====================");
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Tanggal Kadaluarsa: " + tanggal);
        System.out.println("Jumlah (quantity): " + jumlah);
        System.out.println("Berat (gram): " + berat+" gram");
        System.out.println("====================================================");

    }
}
