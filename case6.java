import java.util.Scanner;

public class case6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kesma: ");
        int a = sc.nextInt();
        System.out.println("1- desimetr, 2- kilometr, 3- metr, 4-millimetr, 5-santimetr");
        System.out.print("Uzunlik birligi: ");
        int uzunlik = sc.nextInt();

        switch (uzunlik) {
            case 1 -> System.out.println(a + " desimetr = " + (a / 10) + " metr");
            case 2 -> System.out.println(a + " metr = " + (a * 1000) + " metr");
            case 3 -> System.out.println(a + " kilometr = " + (a) + " metr");
            case 4 -> System.out.println(a + " millimetr = " + (a / 1000) + " metr");
            case 5 -> System.out.println(a + " santimetr = " + (a / 100) + " metr");
            default -> System.out.println("Xato");
        }
    }
}
