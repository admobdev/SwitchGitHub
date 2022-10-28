import java.util.Scanner;

public class case7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qiymat: ");
        int a = sc.nextInt();
        System.out.println("1- kilogramm, 2- milligram, 3- gramm, 4-tonna, 5-sentner");
        System.out.print("Og'irlik birligi: ");
        int uzunlik = sc.nextInt();

        switch (uzunlik) {
            case 1 -> System.out.println(a + " kilogramm = " + (a) + " kilogramm");
            case 2 -> System.out.println(a + " milligramm = " + (a / 1000000) + " kilogramm");
            case 3 -> System.out.println(a + " gramm = " + (a/1000) + " kilogramm");
            case 4 -> System.out.println(a + " tonna = " + (a / 0.001) + " kilogramm");
            case 5 -> System.out.println(a + " sentner = " + (a * 100) + " kilogramm");
            default -> System.out.println("Xato");
        }
    }
}
