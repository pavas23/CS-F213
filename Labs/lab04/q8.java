class Shape {
	public void computeArea() {
		System.out.println("Area of shape");
	}
}

class Triangle extends Shape {
	private int height, length;

	Triangle(int l, int h) {
		height = h;
		length = l;
	}

	public void computeArea() {
		float area = (0.5f * length * height);
		System.out.println("Area of shape is: " + area);
	}
}

class Square extends Shape {
	private int side;

	Square(int s) {
		side = s;
	}

	public void computeArea() {
		int area = side * side;
		System.out.println("Area of shape is: " + area);
	}
}

public class q8 {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.computeArea();

		/*
		 * Triangle t;
		 * t = new Shape();
		 * t.computeArea();
		 * 
		 * Square sq;
		 * sq = new Shape();
		 * sq.computeArea();
		 */

		// so parent class obj can point to child class
		Shape s2 = new Square(2);
		s2.computeArea();

		Shape s3 = new Triangle(2, 3);
		s3.computeArea();
	}
}
