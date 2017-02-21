class MultilevelInheritance {
		String s ;
		public void printString() {
				s = "hello world";
				System.out.println(s);
		}
}

class TestingInheritance extends MultilevelInheritance {
		int a , b;
		TestingInheritance(){
				a = 5;
				b = 8;
		}
		public void sum() {
				int sum;
				sum= a+b;
				System.out.println(sum);
		}
		//private method cannot be used by parent class 
		private void subtract(){
				System.out.println("subtraction="+ (a - b));
		}
}

class ChildClass extends TestingInheritance {
		ChildClass() {
				System.out.println("successfully performed inheritance");
		}
		// overiding function of parent class [ TestingInheritance ]
		public void sum(){
				System.out.println(10+20);
		}
}

class inheritance {
		public static void main(String args[]) {
				// TestingInheritance test = new TestingInheritance();
				// test.sum();
				ChildClass childObject = new ChildClass();
				childObject.sum();
				// childObject.subtract();
				childObject.printString();
		}
}
