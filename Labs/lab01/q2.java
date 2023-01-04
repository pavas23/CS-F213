import java.util.Scanner;

class q2{
    public static void main(String args[]){
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        r = sc.nextFloat();
        double circumference, area, diameter;
        circumference = 2*3.14*r;
        area = 3.14*r*r;
        diameter = 2*r;
        System.out.println("Circumference is "+circumference);
        System.out.println("Area is "+area);
        System.out.println("Diameter is "+diameter);
    }
}