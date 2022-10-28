import java.util.Scanner;

public class case5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("Amal kiriting: ");
        System.out.println("1 qo'shish, 2 ayirish, 3 bo'lish, 4 ko'paytrish");
        int n = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        switch (n) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a / b);
            case 4 -> System.out.println(a * b);
            default -> System.out.println("Xato");
        }
    }
}
