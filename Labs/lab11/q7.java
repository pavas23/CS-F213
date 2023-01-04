import java.io.*;

class q7 {
	public static void main(String args[]) {
		String files[];
		File d = new File("*TODO*"); // Use the 'pwd' command to get the absolute directory path
		files = d.list(); // returns list of files
		for (int i = 0; i < files.length; i++) {
			File f = new File(d, files[i]);
			boolean b = f.isDirectory();
			if (b)
				System.out.println("File : " + f.getName() + " : directory");
			else
				System.out.println("File : " + f.getName() + " : file");
		}
	}
}
