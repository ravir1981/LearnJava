import java.util.Scanner;

public class calculator_switch {
    public static void main(String[] args) {
        int input = 0;
        System.out.println("The Calculator");
        System.out.println("Enter the number:");
        Scanner reader = new Scanner(System.in);
        System.out.println(
                "1. Add | 2. Subtract | 3. Multiply | 4. Divide"
        );
        input = reader.nextInt();
        int a = 0;
        int b = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = read.nextInt();
        Scanner read1 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        b = read1.nextInt();
        System.out.println("First number is " + a + " and Second number is " + b);

        switch (input) {
            case 1:
                System.out.println("Addition of " + a + " + " + b + " = " + add(a, b));
                break;
            case 2:
                System.out.println("Subtraction of " + a + " - " + b + " = " + subtract(a, b));
                break;
            case 3:
                System.out.println("Multiplication of " + a + " * " + b + " = " + multiply(a, b));
                break;
            case 4:
                System.out.println("Division of " + a + " / " + b + " = " + divide(a, b));
                break;
        }
    }

    public static int add(int lhs, int rhs) {
        return lhs + rhs;
    }

    public static int subtract(int lhs, int rhs) {
        return lhs - rhs;
    }
    public static int multiply(int lhs, int rhs) {
        return lhs * rhs;
    }
    public static int divide(int lhs, int rhs) {
        return lhs / rhs;
    }
}
