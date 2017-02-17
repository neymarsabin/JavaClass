import java.util.Scanner;
class Overloading {
		void test() {
				System.out.println("hello this is overloading ");
		}
		void test(int a ) {
				System.out.println(a);
		}
		void test(double a) {
				System.out.println("Data type overloading ");
				System.out.println("Double value passed is=" + a);
		}
		void test(int a, int b) {
				System.out.println("Double parameter overloading");
				System.out.println(a + b);
		}
		void test (String s) {
				System.out.println("Data type overloading");
				System.out.println("String is =" + s);
		}
}


class Area {
		// for area of circle 
		void Area(int r) {
				double area;
				area = 3.14 *r*r ;
				System.out.println(area);
		}
		//for area of rectangle
		void Area(int l, int b ) {
				int area;
				area = 2* l + 2*b ;
				System.out.println(area);
		}
}

class Nist3 {
		public static void main(String args[])
		{

				// Scanner scan = new Scanner(System.in);
				// System.out.println("Enter 4 integer number and 2 floating point number \n");
				// int a = scan.nextInt();
				// int b = scan.nextInt();
				// int c = scan.nextInt();
				// int d = scan.nextInt();
				// Double e = scan.nextDouble();
				// Double f = scan.nextDouble();
				// System.out.println(a + " " + b + " " + c + " " + d + " " + e + " "+ f + " ");
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the radius of the circle");
				int r = scan.nextInt();
				System.out.println("Enter the length and breadth  of the rectangle");
				int l = scan.nextInt();
				int b = scan.nextInt();

				Area circle= new Area();
				System.out.println("the area of the circle is ");
				circle.Area(r);
				Area rectangle = new Area();
				System.out.println("the area of the rectangle is ");
				rectangle.Area(l,b);
				// Overloading t1 = new Overloading();
				// t1.test();
				// t1.test(4);
				// t1.test(4.5);
				// t1.test(4,5);
				// t1.test("Hello");
		}
}


 
