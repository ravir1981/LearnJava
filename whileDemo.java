public class whileDemo {
    public static void main(String[] args) {
        int i = 10;
        int value = checkIteration(i);
        System.out.println("Value is " + value);

        if (args.length > 0) {
            try {
                int maxVal = Integer.parseInt(args[0]);
                int totalSum = addValues(maxVal);
                System.out.println("Total sum of value is " + totalSum);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer" );
                //System.exit(1);
            }
        }

        System.out.println("Arg outside " + args[0]);

        for (String s: args) {
            System.out.println("Arguments are " + s);
        }
    }

    public static int addValues(int number) {
        int x = 1;
        int sum = 0;
        while ( x <= number) {
            sum = sum + x;
            x++;
        }
        return  sum;
    }
    public static int checkIteration (int num) {
        int initNum = 1;
        while (initNum < num) {
            System.out.print(initNum + " ");
            initNum++;
        }
        System.out.println();
        return initNum;
    }
}
