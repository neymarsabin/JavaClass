class TestingInheritance {
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
}

class ChildClass extends TestingInheritance {
		ChildClass() {
				System.out.println("successfully performed inheritance");
		}
}

class inheritance {
		public static void main(String args[]) {
				// TestingInheritance test = new TestingInheritance();
				// test.sum();
				ChildClass childObject = new ChildClass();
				childObject.sum();
		}
}
