class q1{
	public static void main(String[] args){
		int a = args.length;
		System.out.println("No. of command line args passed: " +a);
		System.out.println("Printing the command line Arguments:" );
		for(int i=0;i<a;i++){
			System.out.println("The" + (i+1) + "th command line argument is: "+args[i]);
		}
	}
}

