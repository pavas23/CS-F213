import java.util.Scanner;
public class q3{
	public static void main(String[] args){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the value of array at "+i+" index");
			array[i] = sc.nextInt();
		}
		System.out.println("The array entered is ");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int max = -1;
		for(int i=0;i<n;i++){
			if(array[i]>max){
				max = array[i];
			}
		}
		System.out.println("The max element in the given array is "+max);
	}
}

