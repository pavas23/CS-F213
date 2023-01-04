import java.io.*;
class q1
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try
		{
			while(!(line = br.readLine()).equals("stop"))
			{
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			System.out.println("Excepion : "+e);
		}
	}
}
