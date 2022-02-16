import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Mobil M_71200610 = new Mobil();
        PejalanKaki P_71200610 = new PejalanKaki();
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();
        if (kodeLampu==1){
            System.out.println("-----Lampu Hijau-----");
            M_71200610.jalan();
            P_71200610.menunggu();
        }
        else if (kodeLampu==2) {
            System.out.println("-----Lampu Kuning-----");
            M_71200610.kurangiKecepatan();
            P_71200610.bersiap();
        }
        else if (kodeLampu==3) {
            System.out.println("-----Lampu Merah-----");
            M_71200610.berhenti();
            P_71200610.menyeberang();
        }
        else {
            System.out.println("Kode lalu lintas tidak valid");
        }
}
