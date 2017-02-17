import java.util.Scanner;
class CalcualteArea {
		// for the area of the circle 
		void Area(double r ) {
				double area;
				area = 3.14 * r * r;
				System.out.println(area);
		}
		void Area(double l , double b ) {
				double area;
				area = 2 * ( l * b );
				System.out.println(area);
		}
}

class Area {
		public static void main(String args[])
		{
				CalcualteArea area_of_the_figure = new CalcualteArea();
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the radius of the circle");
				Double r = scan.nextDouble();
				System.out.println("Enter the length and breadth of the rectangle");
				Double l = scan.nextDouble();
				Double b = scan.nextDouble();
				System.out.println("the area of the circle is ");
				area_of_the_figure.Area(r);
				System.out.println("the area of the rectangle is ");
				area_of_the_figure.Area(l,b);
		}
}
