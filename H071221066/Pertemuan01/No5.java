package TugasPraktikum.Pertemuan1;
import java.util.Scanner;                                               //import Scanner

public class No5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);                        //membuat scanner baru
        String x = input.next();                                        //deklarasi variabel x dan menyimpan ke scanner
                                                                     
        String hari = x.substring(0,2);            //.substring digunakan u/ mengambil beberapa karakter dari kalimat yang diinput menggunakan index 
        System.out.print(Integer.parseInt(hari));                       //Integer.parseInt digunkan untuk mengonversi string ke int 
        
        String bulan = x.substring(3, 5);
        int month = Integer.parseInt(bulan);
        String months[] = {"Januari", "Februari", "Maret"};
        System.out.print(" " + months[month-1]+" ");
                                                                    //membuat kondisi sesuai angka bulan yang dimasukkan dan menampilkan output sesuai dengan kondisi yang dijalankan
      

        String tahun = x.substring(6, 8);        
        int year = Integer.parseInt(tahun);

        if (year <= 23) {                                                  //membuat kondisi untuk menentukan tahun 
            System.out.println("20" + tahun);                              //menampilkan output sesuai tahun yang diinput
        }else {
            System.out.println("19" + tahun);
        }
        input.close();
    }
}
