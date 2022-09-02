import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        float f,c;
        System.out.println("Input Fahrenheit value ");
        Scanner sc = new Scanner(System.in);
        f = sc.nextFloat();
        c = (f-32)*(5/9);
        System.out.println("Equivalent Celsius value is "+c);
    }
}
