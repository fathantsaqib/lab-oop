package TugasPraktikum.Pertemuan1;

import java.util.Scanner;                                                                   //import scanner

public class No8 {
    public static void main(String[] args) {
        try {
            int[][] nums = {{1, 2, 3}, {4, 5, 6, 10}, {7, 8, 9}};                               //membuat array 2d
            Scanner inp = new Scanner(System.in);                                   
            int angka = inp.nextInt();
            inp.close();

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i] [j] == angka ) {
                        System.out.println("Found " + angka + " at " + i + " " + j);
                        break;
                        }  
                        System.out.println("indeks sekarang "+i+" "+j);
                    }
                   
                }
        }catch(Exception e) {    
            System.out.println("Hanya bisa menerima angka"); 
        }
    } 
}
