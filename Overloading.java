class Overloading {
		void test() {
				System.out.println("hello this is overloading ");
		}
		void test(int a ) {
				System.out.println(a);
		}
		void test(float a) {
				System.out.println("Data type overloading ");
				System.out.println("float value passed is=" + a);
		}
		void test(int a , int b ) {
				System.out.println("Double parameter overloading");
				System.out.println("sum=" + a+b);
		}
		void test (String s) {
				System.out.println("Data type overloading");
				System.out.println("String is =" + s);
		}
}

class Nist3 {
		public static void main(String args[])
		{
				Overloading t1 = new Overloading();
				t1.test();
				t1.test(4);
				t1.test(4.5);
				t1.test(4,5);
				// t1.test("Hello");
		}
}


