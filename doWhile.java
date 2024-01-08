public class doWhile {
    public static void main (String[] args) {
        int i = 21, sum = 0;
        do {
            sum = sum + i;
            i--;
            System.out.println("Sum is " + sum + " and I is " + i);
        }
        while (i > 10);
        System.out.println("Value of sum is " + sum);
    }
}
