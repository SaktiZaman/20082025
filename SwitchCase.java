import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int condition;
        Scanner input = new Scanner(System.in);

        System.out.println("Kondisi lampu merah 1 untuk hijau, 2 untuk kuning, 3 untuk merah");
        condition = input.nextInt();
        switch (condition) {
            case 1:
                System.out.println("Lampu hijau silahkan jalan");
                break;
            case 2:
                System.out.println("Lampu kuning siap-siap untuk jalan");
                break;
            
            case 3:
            System.out.println("Lampu merah harap berhenti");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
