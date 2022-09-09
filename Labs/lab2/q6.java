import java.util.Scanner;
public class q6{
	public static void main(String[] args){
		int n = 0;
		System.out.println("Hello user, enter 1 for circle, enter 2 for rectangle, enter 3 for square, 0 to exit: ");
		Scanner myScanner = new Scanner(System.in);
		n = myScanner.nextInt();
		while(true){
			if(n==1){
				int radius = 0;
				System.out.println("Enter the radius of circle");
				radius = myScanner.nextInt();
				float perimeter;
				perimeter = 2*3*radius;
				System.out.println("The perimter of the circle is: "+perimeter);
				System.out.println("Hello user, enter 1 for circle, enter 2 for rectangle, enter 3 for square: ");
				n = myScanner.nextInt();
			}
			else if(n==2){
				int l,b;
				System.out.println("Enter length of rectangle: ");
				l = myScanner.nextInt();
				System.out.println("Enter breadth of rectangle: ");
				b = myScanner.nextInt();
				int peri;
				peri = 2*(l+b);
				System.out.println("The perimeter of the rectangle is: "+peri);
				System.out.println("Hello user, enter 1 for circle, enter 2 for rectangle, enter 3 for square: ");
				n = myScanner.nextInt();
			}
			else if(n==3){
				int side;
				System.out.println("Enter the side of square: ");
				side = myScanner.nextInt();
				int peri;
				peri = 4*side;
				System.out.println("The perimeter of the sqaure is: "+peri);
				System.out.println("Hello user, enter 1 for circle, enter 2 for rectangle, enter 3 for square: ");
				n = myScanner.nextInt();
			}
			else{
				System.out.println("Please enter a valid number");
				System.out.println("Hello user, enter 1 for circle, enter 2 for rectangle, enter 3 for square: ");
				n = myScanner.nextInt();
			}
			
			if(n==0){
				break;
			}
		}	
}
}

