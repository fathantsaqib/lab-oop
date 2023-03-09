package TugasPraktikum.Pertemuan1;
import java.util.Scanner;                                                      //import scanner 

public class No1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);                            //buat scanner baru 
        String nim;                                                           //deklarasi variabel NIM dengan string dan var soal dengan int 
        int soal;
        System.out.print("NIM : ");                                         //buat inputan 
        nim = input.next();                                               
        soal = Integer.parseInt(nim.substring(nim.length()-3));                 //mengambil NIM dengan indeks ke 7 lalu dimasukkan ke variabel soal

        if (soal % 7 == 0) {                                                   //membuat kondisi
            System.out.println("Soal : No 7");
        }else {                                                               
            System.out.println("Soal : No " + soal%7);

        input.close();
        }
        
    }
    
}
