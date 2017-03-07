interface shape {
		void findarea();
}

interface size {
		 void findarea();
}

class circle implements shape,size {
		int a , b;
		void setData(int length, int breadth) {
				a = length;
				b = breadth;
		}
		public void findarea() {
				System.out.println("Area of circle is = " + (a*b));
		}
}

class MultipleInheritance {
		public static void main(String args[])
		{
				circle c = new circle();
				c.setData(4,5);
				c.findarea();
		}
}
