import java.util.regex.*;

public class q2 {
	public static void main(String[] args) {
		String s;
		// if user does not enter any command line arguments
		try {
			s = args[0];
			boolean b = Pattern.matches("[1-7][0-9]{5}", s);
			if (b)
				System.out.println("Valid Zipcode");
			else
				System.out.println("Invalid Zipcode");
		} catch (Exception e) {
			System.out.println(e + "\n" + "Please enter some arguments!!");
		}

	}
}
