public class q7{
	static int item = 20;
	public static void show(){
		System.out.println("Hello World");
	}
	public static void main(String[] args){
		show(); 
		// for calling a method inside a static mehtod i.e. without creating a obj. make that method static
		System.out.println(item);
		// for calling a variable inside a static mehtod i.e. without creating a obj. make that var static
	}
	
}
// static method can not access non static mehtods/variables of a class
