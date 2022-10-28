import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("K soni: ");
        int k = sc.nextInt();

        switch (k) {
            case 1 -> System.out.println("Yomon");
            case 2 -> System.out.println("Qoniqarsiz");
            case 3 -> System.out.println("Qoniqarli");
            case 4 -> System.out.println("Yaxshi");
            case 5 -> System.out.println("A'lo");
            default -> System.out.println("Xato");
        }
    }
}
