import java.util.Scanner;

public class case10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tomonlar (shimol, janub, sharq, g'arb): ");
        String[] dir = {"shimol", "janub", "sharq", "g'arb"};
        String C = in.next();
        System.out.print("Komanda bering: ");
        int N = in.nextInt();
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
        switch (N) {
            case 1:
                ind = ++ind % 4;
                break;
            case -1:
                ind = (--ind + 4) % 4;
                break;

        }
    }
}