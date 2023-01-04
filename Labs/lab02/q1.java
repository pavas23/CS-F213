public class q1{
	public static void main(String[] args){
		boolean t = true;
		first:{
			second:{
				third:{
					System.out.println("Before the break");
					if(t) break second;
					System.out.println("This is in block third");
					}
				System.out.println("This is in block second");
			}
		}	System.out.println("This is in block first");
	}
}

