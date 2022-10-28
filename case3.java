import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qaysi oy: ");
        int num = sc.nextInt();

        switch(num) {
            case 3:
            case 4:
            case 5:
                System.out.println("Bahor fasli");
            case 6:
            case 7:
            case 8:
                System.out.println("Yoz fasli");
            case 9:
            case 10:
            case 11:
                System.out.println("Kuz fasli");
            case 12:
            case 1:
            case 2:
                System.out.println("Qish fasli");

            default : System.out.println("Xato");
        }
    }
}
