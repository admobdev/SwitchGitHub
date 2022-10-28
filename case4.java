import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qaysi oy: ");
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("Yanvar 31");
            case 2 -> System.out.println("Fevral 28");
            case 3 -> System.out.println("Mart 31");
            case 4 -> System.out.println("Aprel 30");
            case 5 -> System.out.println("May 31");
            case 6 -> System.out.println("Iyun 30");
            case 7 -> System.out.println("Iyul 31");
            case 8 -> System.out.println("August 31");
            case 9 -> System.out.println("Sentabr 30");
            case 10 -> System.out.println("Oktabr 31");
            case 11 -> System.out.println("Noyabr 30");
            case 12 -> System.out.println("Dekabr 31");
            default -> System.out.println("Xato");
        }
    }
}
