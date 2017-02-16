class test {
		int a,b; //instance variable 
		void setData(int x, int y) { // x and y are local variable 
				a=x;
				b=y;
		}
		void display() {
				System.out.println("a=");
				System.out.println(a);
				System.out.println("a="+a);
		}

		void sum() {
				System.out.println("The sum is: ");
		}
		
}

class Nist {
		public static void main(String args[])
		{
				test t1 = new  test(); //dynamic memory allocation of t1 object
				t1.setData(5,4);
				t1.display();

				test t2 = new test();
				t2.setData(6,5);
				t2.display();

				test t3 = new test();
				t3.setData(67,45);
				t3.display();
		}
}
