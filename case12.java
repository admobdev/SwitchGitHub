import java.util.Scanner;

public class case12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("O'lchov birligini kiriting (1 - R, 2 - D, 3 - L, 4 - S): ");
        int N = in.nextInt();
        System.out.print("Qiymatni kiriting: ");
        double A = in.nextInt();
        double xR = 0, xD = 0, xL = 0, xS = 0;
        switch (N) {
            case 1:
                xR = A;
                xD = A * 2;
                xL = A * 2 * Math.PI;
                xS = Math.PI * (A * A);
                System.out.println("radiusi: " + xR);
                System.out.println("diametr: " + xD);
                System.out.println("uzunligi : " + xL);
                System.out.println("maydon: " + xS);
                break;
            case 2:
                xR = A / 2;
                xD = A;
                xL = A * Math.PI;
                xS = (A * A) / 4 * Math.PI;
                System.out.println("radiusi: " + xR);
                System.out.println("diametr: " + xD);
                System.out.println("uzunligi : " + xL);
                System.out.println("maydon: " + xS);
                break;
            case 3:
                xR = A / (2 * Math.PI);
                xD = A / Math.PI;
                xL = A;
                xS = (A * A) / (4 * Math.PI);
                System.out.println("radiusi: " + xR);
                System.out.println("diametr: " + xD);
                System.out.println("uzunligi : " + xL);
                System.out.println("maydon: " + xS);
                break;
            case 4:
                xR = Math.sqrt(A / Math.PI);
                xD = Math.sqrt(A / Math.PI) * 2;
                xL = Math.sqrt(A * 4 * Math.PI);
                xS = A;
                System.out.println("radiusi: " + xR);
                System.out.println("diametr: " + xD);
                System.out.println("uzunligi : " + xL);
                System.out.println("maydon: " + xS);
                break;
            default:
                System.out.println("error");
                break;

        }

    }
}
