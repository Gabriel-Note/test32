
public class MetoderTest {
    public static void main(String[] args) {
        sayHello();
        doubleTest(1,3);

    }
    static void sayHello() {
        System.out.println("hello");
    }
    static double doubleTest2 (double sum1, double sum2){
        double result = sum1 + sum2;
        System.out.println(result);
        System.out.println("1");
        return result;
    }
    static int doubleTest (int sum1, int sum2){
        int result = sum1 + sum2;
        System.out.println(result);
        System.out.println("2");
        return result;
    }
}
