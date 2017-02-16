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
		
}

class Nist {
		public static void main(String args[])
		{
				test t1 = new  test(); //dynamic memory allocation of t1 object
				t1.setData(5,4);
				t1.display();
		}
}
