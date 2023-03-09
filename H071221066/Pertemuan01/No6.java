package TugasPraktikum.Pertemuan1;

import java.util.Scanner;                                                      //mengimport scanner 

public class No6 {
    public static void main (String[] args){
        try {                                                                 //menggunakann try catch untuk menangani jika terjadi error pada program
            Scanner inputLingkaran = new Scanner(System.in);                  //inisialisasi objek input dari class scanner
            double r, luas, phi = 3.14;                                       //deklarasi variabel r sebagai jari-jari, luas, dan juga nilai phi

            System.out.print("Jari-jari lingkaran : ");                    //input nilai jari-jari
            r = inputLingkaran.nextDouble();                                 //menyimpan inputan ke dalam variabel r 

            luas = phi*Math.pow(r, 2);                                     //rumus menghitung luas lingkaran  
            System.out.printf("Luas lingkaran adalah: %.2f", luas);   //program dijalankan dengan print format, karena pada soal harus menampilkan output 2 angka dibelakang koma
            inputLingkaran.close();

        }catch (Exception e) {                                                //catch dijalankan apabila inputan yang dimasukkan bukan angka 
            System.out.print("input yang dimasukkan bukan angka");         //output jika catch dijalankan
        }
    }
}
