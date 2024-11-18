import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = sc.nextInt();
        System.out.println("enter second number:");
        int num2 = sc.nextInt();
        System.out.println("press button for calculus operation:");
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("sum of number" + (num1 + num2));

        } else if (button == 2) {
            System.out.println("subtraction of number" + (num1 - num2));
        } else if (button == 3) {
            System.out.println("multiplication of number" + (num1 * num2));
        } else if (button == 4) {
            System.out.println("Division of number" + (num1 / num2));
        } else {
            System.out.println("Invalid number");
        }
        sc.close();

    }

}
