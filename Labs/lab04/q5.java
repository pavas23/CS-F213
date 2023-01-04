class Box {
	int length, height, width;

	Box() {
		length = 10;
		width = 5;
		height = 2;
	}

	Box(int x, int y, int z) {
		length = x;
		width = y;
		height = z;
	}

	void printBoxDetails() {
		System.out.println("Box length is: " + length);
		System.out.println("Box width is: " + width);
		System.out.println("Box height is: " + height);
	}

	public int volume() {
		return length * width * height;
	}

	public void setDimensions(int x, int y, int z) {
		length = x;
		width = y;
		height = z;
	}
}

public class q5 {
	public static void main(String[] args) {
		Box b1 = new Box(1, 2, 3);
		b1.printBoxDetails();
		int volume = b1.volume();
		System.out.println("The volume of the box is: " + volume);
		b1.setDimensions(1, 1, 1);
		b1.printBoxDetails();

	}
}
