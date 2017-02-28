class finaldemo {
		//final variable should be initialize at the time of declaration
		final int a;

		finaldemo() {
				a=200;
		}

		final void setValue(){
				System.out.println("this is the parent class");
		}
		
		// void initialize()
		// {
		// 		a =200 ;
		// }

		void display(){
				System.out.println(a);
		}
}

class demo {
		void getValue(){
				System.out.println("this is a child class");
		}

}

class finalDemo {
		public static void main(String args[]){
				
		}
}
