import java.net.*;
import java.io.*;
import java.util.*;

class ClientSide {
		public static void main(String args[]) throws IOException  {
				Socket client = new Socket("localhost",4567);

				Scanner in = new Scanner(client.getInputStream());
				PrintWriter out = new PrintWriter(client.getOutputStream(),true);

				out.println("Hello server");
				String st = in.nextLine();
				System.out.println("server say's::" + st);

				in.close();
				out.close();
				client.close();
		}
}
