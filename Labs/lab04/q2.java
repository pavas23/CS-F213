class Box {
	int length, width, height;

	void printBoxDetails() {
		System.out.println("Box length is: " + length);
		System.out.println("Box width is: " + width);
		System.out.println("Box height is: " + height);
	}
}

public class q2 {
	public static void main(String[] args) {
		Box b = new Box();
		b.printBoxDetails();
	}
}
