public class Calculate{
 
	public static void main(String[] arg){
		System.out.println("Calculate...");
		double first = Integer.valueOf(arg[0]);
		double second = Integer.valueOf(arg[1]);
		double summ = first + second;
		double mult = first * second;
		double div = first / second;
		
		System.out.println("Sum " + summ);
		System.out.println("mult " + mult);
		System.out.println("div " + div);
	
	}
};

  

