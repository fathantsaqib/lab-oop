package H071221104.Pertemuan_1;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = inp.nextDouble();

            double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
            System.out.printf("Luas lingkaran adalah: %.2f", luasLingkaran);
        } catch (Exception e) {
            System.out.println("Hanya menerima angka");
        }
        inp.close();
    }

}
