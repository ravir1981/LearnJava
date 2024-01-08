import java.io.Console;
import java.util.Scanner;

public class stdin_ways {
    public static void main(String[] args) {
        method1();
        //method2();
    }
    public static void method2() {
        Console console = System.console();
        String line = console.readLine("Read Line: ");
        int i = Integer.parseInt(console.readLine("Read Number: "));
        System.out.println("Entered String in method 2 is " + line);
        System.out.println("Entered number in method 2 is " + i);
    }
    public static void method1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String s = input.nextLine();
        System.out.println("Entered name is : " + s);
        System.out.println("Enter Age:");
        int age = input.nextInt();
        System.out.println("Ravi's age is " + age);
    }
}
