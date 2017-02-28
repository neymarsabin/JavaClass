//we can make reference object of abstract class but not real object 
abstract class abs {
		// abstract method 
		abstract void run(); //we keep "abstract keyword to make some method abstract"

		void display(){
				System.out.println("to display some contents");
		}
}

class something extends abs {
		void run(){
				System.out.println("this is an abstract class");
		}
}

class demoAbstract{
		public static void main(String[] args){
				//we can create reference object as this
				//abs a = new something();
				
				something a = new something();
				a.run();
		}
}
