import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hafta kuni: ");
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("Duyshanba");
            case 2 -> System.out.println("Seyshanba");
            case 3 -> System.out.println("Chorshanba");
            case 4 -> System.out.println("Payshanba");
            case 5 -> System.out.println("Juma");
            case 6 -> System.out.println("Shanba");
            case 7 -> System.out.println("Yakshanba");
            default -> System.out.println("Bunday kun yo'q !!");
        }
    }
}
