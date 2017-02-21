class test {
		int a, b ;
		int c ;
		static int sum;
		//counting number of objects that are made by using static variable
		static int counter;
		// initializing the parameterized constructor 
		test(int x, int y) {
				a=x;			
				b=y;
		}
		static void sum(int x, int y) {
				sum = x + y ;
				System.out.println(sum);
		}
		void setData(int c ) {
				this.c=c;
		}
		void increment() {
				counter++;
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
				//				t1.setData(5);
				t1.increment();
				t1.display();
				test t2 = new test(20,45);
				t2.increment();
				t2.display();
				test t3 = new test(45,56);
				t3.increment();
				t3.display();
				test t4= new test(20,30);
				t4.sum(5,4);
		}
}
