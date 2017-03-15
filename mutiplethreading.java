// multithreading in java and implementing using inheritance and interface
// 
class test1 extends Thread { // extending or inheriting from the Thread class 
		public void run(){
			 for (int i = 0; i< 5; i++) {
					 try {Thread.sleep(100); }
					 catch (Exception e) { }
					 System.out.println(i);
			 }
		}
}

class test2 extends Thread {
		public void run() {
				for (int i = 0; i < 5; i++) {
					 try { Thread.sleep(100); }
					 catch (Exception e) { }
						System.out.println(i);
				}
		}
}

class multithreading {
		public static void main(String[] args) {
				test1 t1 = new test1();
				test2 t2 = new test2();
				t1.start();
				t2.start();
		}
}
