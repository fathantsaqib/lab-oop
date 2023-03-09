package TugasPraktikum.Pertemuan1;

import java.util.Scanner;                                                     //import module scanner 

public class No2 {                                                      
    
    public static void main(String[] args) {
        try{                                                                            //menggunakann try catch untuk menangani jika terjadi error pada program
            int desimal = 0;                                                            //mendeklarasi variabel bilangan desimal dan bilangan bulat dengan int
            int bulat = 0;
            Scanner inp = new Scanner(System.in);                                       //membuat scanner baru untuk mengambil input user 
            System.out.print("Masukkan jumlah bilangan: ");                          //memasukkan inputan
            int n = inp.nextInt();                                                     
            
            for (int i = 0; i < n; i++) {                                               //membuat perulangan yang menentukan panjang angka yang diinput
                double num = inp.nextDouble();                              
                
                if (num % 1 == 0) {                                                     //kemudian num-nya dibuatkan kondisi 
                    bulat++;
                } else {
                    desimal++;
                }
            }
            
            System.out.println(bulat + " Bilangan Bulat");                              //menampilkan output
            System.out.println(desimal + " Bilangan Desimal");
            inp.close();

        }catch (Exception e) {                                                          //catch akan dijalankan apabila umur yang dimasukkan bukan angka 
            System.out.println("Hanya bisa menerima angka");                         //menampilkan output jika catch dijalankan        
        }
    }
}
