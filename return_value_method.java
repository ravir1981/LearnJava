public class return_value_method {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Before call " + a);
        a = add(a);
        System.out.println("After call " + a);
    }
    public static int add(int a) {
            a++;
            return a;
    }
}
