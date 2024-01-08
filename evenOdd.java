public class evenOdd {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10,11};
        for (int i=0;i<number.length;i++) {
            if (number[i]%2 != 0) {
                System.out.println("Number is ODD " + number[i]);
            } else if (number[i]%2 == 0) {
                System.out.println("Number is EVEN " + number[i]);
            }
        }
    }
}
