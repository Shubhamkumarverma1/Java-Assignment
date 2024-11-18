import java.util.*;

public class invertedtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();

    }
}