import java.util.Arrays;

public class maximum {
    public static void main(String[] args) {
        int[] number = {1, 22, 34, 43, 6, 99, 4,8,10};

        System.out.println("Total Numbers are " + Arrays.toString(number));
        int highest = maximum(number);
        System.out.println("Highest number is " + highest);
    }

    public static int maximum(int[] numbers) {
        int maxSoFar = numbers[0];

        for (int num : numbers) {
            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
