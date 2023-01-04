class Box{
	int length,height,width;
	void printBoxDetails(){
		System.out.println("Box length is: "+length);
		System.out.println("Box width is: "+width);
		System.out.println("Box height is: "+height);
	}
	Box(){
		length = 10;
		width = 5;
		height = 2;
	}
	Box(int x,int y,int z){
		length = x;
		width = y;
		height = z;
	}
}
public class q4{
	public static void main(String[] args){
		Box b1 = new Box();
		b1.printBoxDetails();
		Box b2 = new Box(12,12,12);
		b2.printBoxDetails();
	}
}

