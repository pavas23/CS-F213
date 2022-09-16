import java.util.Scanner;
public class q4{
	public static void main(String[] args){
		int array[][] = {{101,103,105,106,109},{67,70,43,89,56}};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		while(id != -999){
			int flag = 0;
			for(int i=0;i<5;i++){
				if(id == array[0][i]){
					flag = 1;
					System.out.println(array[1][i]);
					break;
				}
			}
			if(flag == 0){
				System.out.println("Please enter a valid id");
			}
			System.out.println("Enter the id: ");
			id = sc.nextInt();
		}
	}
}

