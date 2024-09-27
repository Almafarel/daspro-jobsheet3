import java.util.Scanner;
public class Kafe02 {
    public static void main(String [] args) {

    Scanner input = new Scanner(System.in);
    boolean keanggotaan;
    int jmlKopi, jmlTeh, jmlRoti; 
    double hargaKopi = 15000.0, hargaTeh = 8000.0, hargaRoti = 200000.0;
    float disko = 10 / 100f;

    // Memasukkan keseluruhan yang akan dihitung
    System.out.println("Masukkan keanggotan (true/false): ");
    keanggotaan = input.nextBoolean();
    System.out.println("Masukkan jumlah pembeliaan kopi");
    jmlKopi = input.nextInt();
    System.out.println("Masukkan jumlah pembeliaan teh");
    jmlTeh = input.nextInt();
    System.out.println("Masukkan jumlah pembeliaan roti");
    jmlRoti = input.nextInt();

    // Menghitung total harga
    System.out.println("totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti)");

    System.out.println("nominalBayar = totalHarga - (diskon * totalHarga)");

    System.out.println("Keanggotaan pelanggan " + keanggotaan);
    System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlTeh + "teh, " + jmlRoti + "roti");
    System.out.println("Nominal bayar Rp (65000): ");

    
    }

}

    
