import java.util.Scanner;

public class case11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tomonlar (shimol, janub, sharq, g'arb): ");
        String[] dir = {"shimol", "janub", "sharq", "g'arb"};
        String C = in.next();
        System.out.print("Komanda bering N1: ");
        int N1 = in.nextInt();
        System.out.print("Komanda bering N2: ");
        int N2 = in.nextInt();
        int ind = 0;
        switch (C) {
            case "shimol":
                ind = 0;
                break;
            case "g'arb":
                ind = 1;
                break;
            case "sharq":
                ind = 2;
                break;
            case "janub":
                ind = 3;
                break;
            default:
                System.out.println("error");
                break;
        }
        switch (N1) {
            case 1:
                ind = ++ind % 4;
                break;
            case -1:
                ind = (--ind + 4) % 4;
                break;
            case 2:
                ind = (ind + 2) % 4;
                break;
        }
        switch (N2) {
            case 1:
                ind = ++ind % 4;
                break;
            case -1:
                ind = (--ind + 4) % 4;
                break;
            case 2:
                ind = (ind + 2) % 4;
                break;
        }

        System.out.println(dir[ind]);
    }
}