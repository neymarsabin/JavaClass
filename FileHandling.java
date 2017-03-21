import  java.io.*;
// The file class and it's objects declaration always should be inside try catch block else won't work
// 

class FileHandling {
		public static void main(String args[])  {
		// 		try {
		// 				// Creating a new file 
		// 				FileOutputStream f = new FileOutputStream("file.txt");
		// 				// Writing in a file, 65 = A in ASCII
		// 				f.write(65);
		// 				// Closing a file 
		// 				f.close();
		// 				System.out.println("Successfully created a file:");
		// 		}
		// 		catch (Exception e) {
		// 				System.out.println("Error " + e);
		// 		}
				int c;
				try {
						FileInputStream f = new FileInputStream("file.txt");
						c = f.read();
						System.out.println("File contents::"+ (char)c);
						f.close();
				}
				catch (Exception e) {
						System.out.println("Error " + e);
				}
		}
}
