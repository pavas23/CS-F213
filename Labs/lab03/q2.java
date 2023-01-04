public class q2{
	public static void main(String[] args){
		int a = 25;
		int temp;
		int val;
		int b = 13;
		boolean result;
		result = ((a>b) & (a>100));
		System.out.println("Result is: "+result);
		result = ((a>b) | (a>100));
		System.out.println("Result is: "+result);
		result = ((a>b)!=(a>100));
		System.out.println("Result is: "+result);
		val = (a>b)?100:200;
		System.out.println("val is: "+val);
		
	}
}

