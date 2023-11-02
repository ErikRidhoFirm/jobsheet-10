import java.util.Scanner;
public class BioskopWithScanner09{
    public static void main(String []args){
        Scanner input09 = new Scanner(System.in);
       
        int baris,kolom;
        String nama, next;

       String[][] penonton = new String[4][2];

       while (true){
            System.out.print("Masukkan nama: ");
            nama = input09.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input09.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input09.nextInt();
            input09.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input09.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }   
        }
    }
}