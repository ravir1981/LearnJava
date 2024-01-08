//class my_number {
//    int number;
//    public my_number() {
//        number = 1;
//    }
//}
public class pass_reference {
    public int number;
    public pass_reference() {
        number = 1;
    }

    public static void main(String[] args) {
        pass_reference object = new pass_reference();

        System.out.println("Number is " + object.number);

        update(object);
        System.out.println("After Update " + object.number);
    }

    public static void update(pass_reference obj) {
        obj.number++;
    }
}
