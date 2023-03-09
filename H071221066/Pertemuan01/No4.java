package TugasPraktikum.Pertemuan1;
import java.util.Scanner;                                                           //mengimport scanner

public class No4 {
    public static void main(String[] args) {
        Scanner inputKalimat = new Scanner(System.in);                              //membuat scanner baru 

        System.out.print("Masukkan kalimat: ");                                  //meminta inputan ke user 
        String kalimat = inputKalimat.nextLine();                                  //deklarasi variable dan memassukkan inputan ke dalam scanner 

        String[] kata = kalimat.toLowerCase().split(" ");                   //mengambil variabel string kalimat lalu mengubah menjadi huruf kecil dan membagi string menjadi array 
        String kalimatBaru = "";                                                  //deklarasi variabel menggunakan kalimatBaru setelah diubah menjadi huruf kecil

        for (int i = 0; i < kata.length; i++) {                                   //membuat perulangan 
            kalimatBaru += kata[i].toUpperCase().charAt(0) + kata[i].substring(1) + " ";
        }

        System.out.println("Kalimat setelah diubah: " + kalimatBaru);      //menampilkan output
        inputKalimat.close();
    }
}