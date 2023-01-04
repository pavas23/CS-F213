
import java.util.StringTokenizer;

public class q4 {
    public static void main(String[] args) {
        String s = args[0];
        String delimeter = args[1];
        StringTokenizer stk = new StringTokenizer(s, delimeter);
        while (stk.hasMoreTokens()) {
            System.out.print(stk.nextToken() + " ");
        }

    }
}
