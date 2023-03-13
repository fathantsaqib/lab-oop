import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        try{
            System.out.print("Nama :");
            String name = input.nextLine();

            System.out.print("Age :");
            int age = input.nextInt();
            input.nextLine();  //baris 

            System.out.print("Hobby :");  
            String hobby = input.nextLine();

            System.out.println("Nama saya" + name + ", " +age + " Tahun, hobby " + hobby + ".");
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka");
        }
        input.close() ;
    }
}