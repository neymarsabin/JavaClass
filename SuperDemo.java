//this is a parent class 
class Super {
		int a = 10;
		// Parent Class sum  
		void sum() {
				System.out.println(5+6);
		}
		// a default constructor 
		// super(){
		// 		System.out.println("this is the constructor of class super");
		// }
		// for a parameterized constructor 
		Super(int a) {
				int x ;
				x=a;
				System.out.println("the value of x is="+x);
		}
}

//child class which inherits super class 
class SuperKeyword extends Super {
		int a=5;
		// a default constructor for this class 
		// SuperKeyword(){
		// 		System.out.println("this is the constructor of class SuperKeyWord");
		// }
		// for a parameterized constructor 
		SuperKeyword(int b,int c) {
				//super keyword must be at first always
				//the value of c is passed to the parent class constructor 
				super(c);
				int y;
				y=b;
				System.out.println("the value of y is ="+y);
		}
		void display(){
				System.out.println("The value of a is"+a);
				System.out.println("The value of b is="+ super.a);
		}
		// child class sum() method 
		void sum() {
				System.out.println(8+4);
		}

		//to access the sum method of parent class 
		void SumWithSuper(){
				super.sum();
		}
}

// class SuperSuper extends SuperKeyword {
// 		int a = 8;
// }


class SuperDemo {
		public static void main(String args[]){
				//when calling object of the child class we must pass two parameters for the constructor 
				SuperKeyword object = new SuperKeyword(89,45);
				
		}
}

