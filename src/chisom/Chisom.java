
package chisom;

import java.util.Timer;
import java.util.TimerTask;

class Chisom{
	
	static String color;
	
	public static void main(String[] args){
		
//		System.out.print("Hello World \n");
//		System.out.printf("Hello Chisom \n");
//		System.out.println("Hello Abdul \n");
//		
//		int double long short float String char var boolean
//		
//		int x = 5;
//		double chioma = 3.7;
//		short f = 3;
//		long kapachimerrymerryjupaku = 4;
//		float g = 4;
//		String word = "come";
//		char qw = 't';
//		var go = true;
//		boolean k = false;
//		
//		String and;
//		and = "bling";
//		color = "blue";
//		String hair;
//		hair = "bone stright";
//		
//		maths(25, 5);
//		workingwithstrings("Linda");
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			
			public void run(){
				System.out.println("Starting.....");//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
//				for(int i = 0; i <= 10; i++){
//					System.out.println("Starting...");
//					System.out.println("Timer: " + i);
//					if(i == 10){
//						System.out.println("Ending");
//						System.out.println();
//					}
//				}
				System.out.println("Ending");
			}
		};
		
		
		timer.schedule(task, 5000, 5000);
		
		
	}
	
	
	public static void dop(){
		
		color = "red";
//		hair = "weavon";
	}
	
	public static void maths(int a, int b){
		
		int sum = a + b;
		int minus = a - b;
		int multiply = a * b;
		int divide = a / b;
		
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println();
		
	}
	
	public static void workingwithstrings(String name){
		
		String word = "I Love ";
		int x = 3;
		int y = 5;
//		int sum = x + Integer.parseInt(y);
		String dog = Integer.toString(x) + y;
		System.out.println(word + name);
		System.out.println(dog);
		
	}
	
}
