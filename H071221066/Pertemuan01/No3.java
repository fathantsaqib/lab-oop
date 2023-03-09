package TugasPraktikum.Pertemuan1;

import java.util.Scanner;                                                        //mengimport Scanner

public class No3 {
    public static void main(String[] args){
        try {                                                                   //menggunakann try catch untuk menangani jika terjadi error pada program
            Scanner input = new Scanner(System.in);                             //membuat scanner baru 
            String name, hobby;                                                 //mendeklarasikan variabel nama dan hobby menggunakan string, sedangkan umur menggunakan int
            int umur;

            System.out.print("Nama : ");                                     //meminta inputan ke user
            name = input.nextLine();                                           //menggunakan scanner dan menyimpan apa yang diketik dalam variabel

            System.out.print("Umur : ");
            umur = input.nextInt();
            input.nextLine();                                                  //.nextLine() perlu ditambahkan karena jika .nextInt berada dibawah .nextLine maka baris selanjutnya akan dilewati

            System.out.print("Hobby : ");
            hobby = input.nextLine();
            
            System.out.print("Nama saya " + name + ", " + umur + " tahun, " + "hobby " + hobby);   //menampilkan output 
            input.close();
           
        }catch (Exception e) {                                     //catch akan dijalankan apabila umur yang dimasukkan bukan angka 
            System.out.print("Umur yang diinput bukan angka");  //menampilkan output jika catch dijalankan        
        }
    }
}
