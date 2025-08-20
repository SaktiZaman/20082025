import java.util.Scanner;

public class diskon2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total, diskon, Final, bayar, kembalian;
        int user;
        boolean jalan = true;
        System.out.println("===================");
        System.out.println("Masukkan total");
        total = input.nextDouble();
        while (jalan == true) {
            System.out.println("===================");
            System.out.println("Masukkan Pembayaran");
            bayar = input.nextDouble();
            if (total > 500000) {
                diskon = 0.2;
            } else if (total > 300000 && total <= 500000) {
                diskon = 0.15;
            } else if(total > 100000 && total <= 300000){
                diskon = 0.1;
            } else {
                diskon = 0;
            }
            Final = total - (total * diskon);
            kembalian = bayar - Final;

            if (Final < bayar) {
                System.out.println("==================");
                System.out.println("Pembayaran berhasil");
                System.out.println("==================");
                System.out.println("Total pembelian: " + total);
                System.out.println("Diskon: " + (diskon * 100) + "%");
                System.out.println("Harga final: " + Final);
                System.out.println("Pembayaran: " + bayar);
                System.out.println("Kembalian: " + kembalian);
                System.out.println("==================");
                jalan = false;
                System.exit(0);
            } else{
                System.out.println("Pembayaraan tidak cukup");
                System.out.println("Klik 1 untuk memasukkan pembayaran baru, klik lainnya untuk log out");
                user = input.nextInt();
                if (user != 1) {
                    jalan = false;
                    System.exit(0);
                }
            } 
        }
    }
}
