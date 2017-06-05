import java.net.*;
import java.io.*;
import java.util.*;

class Serverside {
		public static void main(String args[]) throws IOException {
				ServerSocket s = new ServerSocket(4567);
				Socket connection = s.accept();
				
				Scanner in = new Scanner(connection.getInputStream());
				PrintWriter out = new PrintWriter(connection.getOutputStream(),true);

				out.println("welcome to the server");
				String st = in.nextLine();
				System.out.println(" client say's:::" + st);

				
				in.close();
				out.close();
				s.close();
		}
}
		
