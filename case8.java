import java.util.Scanner;

public class case8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qaysi kun: ");
        int d = sc.nextInt();
        System.out.print("Qaysi oy: ");
        int m = sc.nextInt();

        int onlik = d / 10;
        int birlik = d % 10;
        switch (onlik) {
            case 1 -> System.out.print("O'n ");
            case 2 -> System.out.print("Yigirma ");
            case 3 -> System.out.print("O'ttiz ");
        }
        switch (birlik) {
            case 1 -> System.out.print(" birinchi ");
            case 2 -> System.out.print(" ikkinchi ");
            case 3 -> System.out.print(" uchinchi ");
            case 4 -> System.out.print(" to'rtinchi ");
            case 5 -> System.out.print(" beshinchi ");
            case 6 -> System.out.print(" oltinchi ");
            case 7 -> System.out.print(" yettinchi ");
            case 8 -> System.out.print(" sakkizinchi ");
            case 9 -> System.out.print(" to'qqizinchi ");
        }
        switch (m) {
            case 1 -> System.out.print(" yanvar");
            case 2 -> System.out.print(" fevral");
            case 3 -> System.out.print(" mart");
            case 4 -> System.out.print(" aprel");
            case 5 -> System.out.print(" may");
            case 6 -> System.out.print(" iyun");
            case 7 -> System.out.print(" iyul");
            case 8 -> System.out.print(" august");
            case 9 -> System.out.print(" sentabr");
            case 10 -> System.out.print(" oktabr");
            case 11 -> System.out.print(" noyabr");
            case 12 -> System.out.print(" dekabr");
            default -> System.out.print("Xato");
        }
    }
}
