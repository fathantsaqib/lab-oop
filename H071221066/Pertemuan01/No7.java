package TugasPraktikum.Pertemuan1;

import java.util.Scanner;                                                   //import scanner

public class No7 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);    
        System.out.print("input bunga : ");
        String flower = inp.nextLine();                                      
        int hasil = findIndex(flower);                                         
        System.out.println("ditemukan di indeks " + hasil);                                          

        inp.close();
    }
    public static int findIndex(String teks) {                                  //membuat method findIndex u/ mengecek indeks teks yang diinput
        String bunga[] = {"Mawar", "melati", "kamboja", "matahari", "anggrek"};     //membuat array dengan tipe string
        int indeks= 0;
        for (String b : bunga) {
            if (b.equalsIgnoreCase(teks)){
                return indeks;
            }
            indeks++;
        }
        return -1;                                                               //mengembalikan -1 jika inputan tidak terdaftar dalam array 
    } 
}

