class Shape {
	public int computeArea(int s) {
		return s * s;
	}

	public int computeArea(int x, int y) {
		return x * y;
	}
}

public class q6 {
	public static void main(String[] args) {
		Shape s1;
		s1 = new Shape();
		int area1 = s1.computeArea(10);
		System.out.println("The area returned when one argument is passed is: " + area1);
		int area2 = s1.computeArea(10, 20);
		System.out.println("The area returned when two arguments are passed is: " + area2);

	}
}
