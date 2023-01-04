import java.lang.*;
class q4{
	public static void main(String[] args){
		String str1 = "Hello";
		int a = 250;
		System.out.println("The value of string str1 is: ");
		System.out.println(str1);
		String str2 = str1;
		System.out.println("The value of string str2 is: ");
		System.out.println(str2);
		String str3 = new String("world");
		System.out.println("The value of string str3 is: ");
		System.out.println(str3);
		String str4 = str2 + str3;
		System.out.println("The value of string str4 is: ");
		System.out.println(str4);
		String str5 = str2 + "How are you";
		System.out.println("The value of string str5 is: ");
		System.out.println(str5);
		System.out.println("value of variable a is: "+a);
		
	}
}

