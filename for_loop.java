public class for_loop {
        public static int printValue(int value){
            int input;
            for( input =0; input <= value; input++) {
                System.out.println("Value of input " + input);
            }
            return input;
        }
        public static void main(String[] args) {
            int value = 10;
            int number = printValue(value);
            System.out.println(("Value after function " + number));
        }
}
