import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nim : ");
        String nim = sc.nextLine();
        System.out.print("Soal : No.");
        int angka = Integer.parseInt(nim.substring(nim.length()-3));
        //System.out.println(angka%7 == 0? 7: angka%7);
        if (angka%7 == 0) {
            System.out.println(7);

        } else{
            System.out.println(angka%7);
        }
        sc.close();

    }
}