import java.util.*;

public class factorial {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of a no.=" + factorial);

        int sum = 0;
        while (factorial > 0) {
            sum += factorial % 10;
            factorial /= 10;
        }
        System.out.println("sum of digits of the factorial:" + sum);

        sc.close();

    }

}