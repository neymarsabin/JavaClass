interface  shape {
		double PI = 3.1416;
		void findarea();
}

class circle implements shape {
		double r ;
		void setData (int radius){
				r = radius;
		}

		void findarea() {
				system.out.println("Area of the circle="+(PI*r*r));
		}
}

class InterfceDemo {
		public static void main(String args[]){
				circle c = new circle();
				c.setData(19);
				c.findarea();
		}
}
