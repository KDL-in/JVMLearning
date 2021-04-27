
/*

-Xss256k
* */
public class StackErrorTest {
    private static int count = 0;
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}
