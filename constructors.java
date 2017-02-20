class test {
		int a, b ;
		int c ;
		//counting number of objects that are made by using static variable
		static int counter;
		// initializing the parameterized constructor 
		test(int x, int y) {
				a=x;			
				b=y;
				counter++;
		}

		void setData(int c ) {
				this.c=c;
		}

		void display() {
				System.out.println("a="+a+ " " + "b=" + b);
				System.out.println("c="+c);
				System.out.println("the number of objects called are:" + counter);
		}
}

class constructors {
		public static void main(String  args[])
		{
				// starting a new object with parameterized constructor 
				test t1 = new test(5,10);
				t1.setData(5);
				t1.display();
				test t2 = new test(20,45);
				t2.display();
		}
}
